package IO.Network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class S9_MultiThreadSocketServer {

	private static final int port = 7777;
	
	public static void main(String[] args) throws IOException {
		log.debug("main({}) invoked.", Arrays.toString(args));
		
		ServerSocket serverSocket = new ServerSocket(port);
		
		try(serverSocket) {
			
			while(true) {
				log.info("listenning on {} ...", serverSocket);
				
				Socket sock = serverSocket.accept();
				log.info("\t+ Client connected from {}", sock);
//				---
				
				//데이터 수신 Task 별도의 스레드에서 수행 
				new Receiver01("Receiver01", sock).start();
//				new Receiver02("Receiver02", sock).start();
				
				//데이터 수신 Task 별도의 스레드에서 수행 
				new Sender01("Sender01", sock).start();
			
				
			}//while
		}//try-with-resource
	}//main
}//end class
