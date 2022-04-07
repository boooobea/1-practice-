package IO.Network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class S7_SingleThreadSocketServer {
	private static final int CR = 13;
	private static final int LF = 10;
	
	public static void main(String[] args) throws IOException {
		log.debug("main({}) invoked.", Arrays.toString(args));
		
		int listenPort = 7777;
		int backLog = 100; 	//serverSocket backlog Q size
//		---
		//포트바인딩하는 ServerSocket 생성 (바인딩포트 = Listen port) 
		ServerSocket serverSocket = new ServerSocket(listenPort, backLog);
		log.info("1. serverSocket : {}", serverSocket);
		
//		---
		try(serverSocket){
			
			while(true) { //무한루프 
				
				log.info("---------------------------------------------");
				log.info("2. listening on port {} and addr {} ...", listenPort, serverSocket.getInetAddress());
				log.info("---------------------------------------------");
				
				//setSoTimeout : 연결요청을 얼마나 기다리는지 accept메소드의 수행전에 작용
				serverSocket.setSoTimeout(0);		// 0 :무한정 기다림   
//				serverSocket.setSoTimeout(5*1000);	
				
				//새로운 연결요청이 들어오면 수락, 새로운 Socket객체 생성, C-S간의 연결 생성 
				Socket sock = serverSocket.accept(); //Block I/O : Listening and Accepting
				
				//연결된 새로운 클라이언트에 대한 정보를 출력 
				log.info("3. Client Conneted.");
				log.info("\t3-1. sock : {}", sock);
				log.info("\t3-2. getLocalSocketAddress : {}", sock.getLocalSocketAddress());
				log.info("\t3-3. getRemoteSocketAddress : {}", sock.getRemoteSocketAddress());
				
				
				String recvLine = null;
				String sendLine = null; 
				
				try (sock){
					
					//--------------
					// RECV 
					//--------------
					try {
						InputStream is = sock.getInputStream();
						BufferedReader br = new BufferedReader(new InputStreamReader(is));
						
						recvLine = br.readLine();		//Block I/O
						
						log.info("\t3-4. recvLine : {}", recvLine);
						
					} catch ( Exception e) {
						log.info("\t *Excepction : {} - {}", e.getClass().getName(), e.getMessage());
					} finally {
//						sock.shutdownInput();
					}//try-catch-finally
					
					//-----------
					// SENT 
					//-----------
					
					try {
						sendLine = recvLine;
						
						OutputStream os = sock.getOutputStream();
						BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
						
						bw.write(sendLine);	//Block I/O
//						bw.write(CR); //엔터키 누를때의 키코드값 
//						bw.write(LF); //엔터키 누를때의 키코드값 
						
						bw.flush();
						
						log.info("\t3-5. sendLine : {}", sendLine);
					} catch ( Exception e) {
						log.info("\t *Excepction : {} - {}", e.getClass().getName(), e.getMessage());
					} finally {
//						sock.shutdownOutput();
					}//try-catch-finally
					
				}//try-with-resource:sock
				log.info("4. Client Disonnected.");
			}//while
		}//try-with-resources:serverSocket
		
	}//main
	
}//end class
