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
//ObjectInput/OutputStream 보조스트림을 이용한 통신구현예제(서버)
public class S8_ObjectSingleThreadSocketServer {

	public static void main(String[] args) throws IOException {
		log.debug("main({}) invoked.", Arrays.toString(args));
		
		int listenPort = 7777; 
		int backlog = 100; 
		
		ServerSocket serverSocket = new ServerSocket(listenPort, backlog);
		log.info("1.serverSocket : {}", serverSocket);
		
		try(serverSocket){
			
			while(true) {
				log.info("----");
				log.info("2. Server listening on address : {}", serverSocket.getLocalSocketAddress());
				log.info("----");
				
				Socket socket = serverSocket.accept();
				log.info("3. Client connected from address : {}", socket.getRemoteSocketAddress());
				
//				---
				
				try(socket){
					//Recv 
					InputStream is = socket.getInputStream();
					ObjectInputStream ois = new ObjectInputStream(is); 
					//객체통신(직렬/역직렬화) 을위해 보조스트림 생성
					
					Member member = (Member)ois.readObject();
					//readObject메소드의 리턴타입은 object이기 때문에 강제형변환 필요 
					log.info("4. Received a member from client : {}", member);
					
//					-----
					
					//Sent 
					OutputStream os = socket.getOutputStream();
					ObjectOutputStream oos = new ObjectOutputStream(os);
					
					member.setId(0);
					member.setName("김코딩");
					member.setAge(22);
					
					oos.writeObject(member);  //객체출력
					oos.flush();
					
					log.info("5. Sended a modified member to client : {}", member);
					
				} catch ( ClassNotFoundException | IOException e) {
					e.printStackTrace();
				}//try-with-resource : socket
			}//while
		}//try-with-resource : serverSocket
	}//main
}//end class
