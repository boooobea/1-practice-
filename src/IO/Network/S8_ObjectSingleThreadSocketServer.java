package IO.Network;


import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class S8_ObjectSingleThreadSocketServer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		log.debug("main({}) invoked.", Arrays.toString(args));
		
		int listenPort = 7777;
		int backlog = 100;
		
//		----
		
		ServerSocket serverSocket = new ServerSocket(listenPort, backlog);
		log.info("1. serverSocket : {}", serverSocket);
		
//		----
		
		try (ServerSocket){
			while(true) {

				log.info("--------------------------------------");
				log.info("2. Server listening on address: {} ...", serverSocket.getLocalSocketAddress());
				log.info("--------------------------------------");
				
				Socket socket = serverSocket.accept();
				
				log.info("3. Client connected from address: {}", socket.getRemoteSocketAddress());
//				------
				
				try(socket){
					
					InputStream is = socket.getInputStream();
					ObjectInputStream ois = new ObjectInputStream(is);
					
					Member member = (Member) ois.readObject();
					log.info("4. Received a member from client: {}", member);
					
//					-------
					
					OutputStream os = socket.getOutputStream();
					ObjectOutputStream oos = new ObjectOutputStream(os);
					
					member.setId(2);
					member.setName("Trinity");
					member.setAge(33);
					
					oos.writeObject(member);
					oos.flush();
					
					log.info("5. Sended a midified member to Client:{}", member);
					
					
					
				}//try-with : socket
			}//while
		}//try-with-resources
	}//main
}//end class
