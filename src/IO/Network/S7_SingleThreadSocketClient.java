package IO.Network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class S7_SingleThreadSocketClient {
	//키보드 엔터키를 눌렀을때의 발생하는 키코드 상수로선언 
	private static final int CR = 13;
	private static final int LF = 10;
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		log.debug("main({}) invoked.", Arrays.toString(args));
		
//		---
		
		String serverAddress = "127.0.0.1"; //loopback Address(127.0.0.1)'s domain name
		int serverPort = 7777;
		int connecTimeout = 1000;   	//milliseconds 
		
//		---
		// 1st : Socket 객체 생성시 바로 서버로 연결 시도 (매개변수로 입력)
//		Socket socket = new Socket(serverAddress, serverPort); 	
//		Socket socket = new Socket(InetAddress.getByName(serverAddress), serverPort);
//		log.info("1. socket : {}", socket);
		
//		---
		//2st : Socket 객체 생성, 서버 연결시도 분리 
		Socket sock = new Socket();		//socket 객체만 생성
		
//		sock.connect(new InetSocketAddress(serverAddress, serverPort)); //connect() : 객체생성하여 연결 
		sock.connect(new InetSocketAddress(serverAddress, serverPort), connecTimeout); 
		//connecTimeout : milliseconds로 지정, 연결까지의 시간 
		log.info("1. socket : {}", sock);
//		
		log.info("\t1-1. getLocalSocketAddress 	: {}", sock.getLocalSocketAddress()); //port정보포함 
		log.info("\t1-2. getRemoteSocketAddress : {}", sock.getRemoteSocketAddress());
		
//		------------
//		SENT
//		------------
		
		try(sock){
			
			try {
				String sendLine = "Hello, World!!!";
				
				//Socket 객체에서 데이터를 보내고 받을 수 있는 InputStream/OutputStream 객체를 얻어낼 수 있다.
				OutputStream os = sock.getOutputStream();
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os)); //chain
				
				bw.write(sendLine);  		//Block I/O
				// Enter 키 코드값 전송 
				bw.write(CR);
				bw.write(LF);
				
				bw.flush();
				log.info("2. sendLine : {}", sendLine);
			} catch ( Exception e) {
				log.error(" * Exception : {} - {}", e.getClass().getName(), e.getMessage());
			} finally {
//				sock.shutdownInput(); //Socket 출력 close : Socket은 양방향 이기 때문에 한쪽을 닫을 수 있다. 
//				sock.shutdownInput(); //Socket 입력 close 
			}//try-catch-finally 
							
//		--------------
//		RECV
//		--------------
	
		try {
			InputStream is = sock.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String recvLine = br.readLine(); //block I/O
			//**readLine()의 경우 enter key가 없으면 행을 알수가 없기 때문에 읽을수 없다. 
			
			log.info("3. recvLine : {}", recvLine);
		} catch (Exception e) {
			log.error(" * Excepction : {} - {} ", e.getClass().getName(), e.getMessage());
			
		} finally {
//			sock.shutdownInput();
		}//try-catch-finally
		
	}//try-with-resource:sock
	
		log.info("4. Disonnected" );
		
	}//main
}//end class
