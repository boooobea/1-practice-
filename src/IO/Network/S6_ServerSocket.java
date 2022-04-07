package IO.Network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class S6_ServerSocket {
	private static final int CR = 13;
	private static final int LF = 10;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		log.debug("main({}) invoked.", Arrays.toString(args));
		
		int listenPort = 7777;
		int backlog = 100;			//연결요청Q
		
//		--- 
		
		//1. 클라이언트의 연결요청을 특정 포트로 받아서 연결 수락, 
		//   Socket객체까지 만들어내는데 핵심역할을 하는 객체 생성 
		ServerSocket serverSocket = new ServerSocket();
//		log.info("1. serverSocket : {}", serverSocket);
		
		//2. 서버가 특정포트로 Listen할 수 있도록 port Binding 실행 
		//** InetAddress = Hostname + IP address
		//** InetSocketAddress = InetAddress + Port
		serverSocket.bind(new InetSocketAddress(listenPort));
//		serverSocket.bind(new InetSocketAddress(InetAddress.getLocalHost(), listenPort));
//		serverSocket.bind(new InetSocketAddress(InetAddress.getLocalHost(), listenPort), backlog);
//		serverSocket.bind(new InetSocketAddress("0.0.0.0", listenPort), backlog);
//		log.info("2. serverSocket : {}", serverSocket);
		
//		---
		//3. 
//		ServerSocket serverSocket = new ServerSocket(listenPort);
//		log.info("serverSocket : {}", serverSocket);
				
//		ServerSocket serverSocket = new ServerSocket(listenPort, backlog);
//		log.info("serverSocket : {}", serverSocket);
		
//		ServerSocket serverSocket = new ServerSocket(listenPort, backlog,InetAddress.getLocalHost());
		log.info("serverSocket : {}", serverSocket);
		
//		---
//		Thread.sleep(1000*60);//60초 동안 실행을 멈춘다(blocking)
//		---
		
		try (serverSocket) {
			log.info("2. Server listening on port{} and addr {} ...", 
					listenPort, serverSocket.getInetAddress());
			
			while(true) { 	//무한루프
				Socket socket = serverSocket.accept();	//Block I/O
//				---
//				Thread.sleep(1000*60);
//				---
				
				try(socket){ 
					log.info("3. socket : {}", socket);
					log.info("\t + getInetAddress :{}, getPort : {}, getLocalPort:{}" , 
							socket.getInetAddress(), socket.getPort(), socket.getLocalAddress());
					
					log.info("\t + getRemoteSocketAddress :{}", socket.getRemoteSocketAddress());
					//getRemoteSocketAddress():서버와연결된 클라이언트의 정보(IP,Port)
				
				}//try-with-resource : socket
			}//while
		}//try-with-resource : serverSocket
	}//main
}//end class
