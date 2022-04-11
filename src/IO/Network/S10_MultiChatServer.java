package IO.Network;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class S10_MultiChatServer {

	private static final int port=7777;
	
//	private static final Charset charset = StandardCharsets.UTF_8;	 //xx
//	private staitc final Charset charset = Charset.defaultCharset(); //xx
//	private staitc final Charset charset = Charset.forName("MS949"); //ok
	private static final Charset charset = Charset.forName("UTF-8"); //ok
	
	//Multicast 기반의 채팅을 구현하기 위해서는 서버의 역할은 오로지 중개역할을 잘 하면 된다.
	//서버가 직접 자신의 메세지를 보내고 받는것이 아니라 
	//서버에 연결된 클라이언트들끼리 보내고/받는 메세지 처리를 중앙에서 잘 처리해야 한다.  
	//서버에 연결된 모든 클라이언트 정보를 담을 컬렉션이 필요하고 이 컬렉션을 Map<K,V>으로 한다. 
	private static Map<String, Socket> clients;
	
	
	public S10_MultiChatServer() {
		log.trace("Default constructot invoked.");
		
		clients = new HashMap<>(); //HashMap 객체 생성 
		
		//HashMap은 멀티쓰레드 환경에서 Thread-Unsafe하기 때문에, 이를 다시 Thread-safe하게 
		//조작할 수 있도록 만들어 줘야한다. 이를 해주는것이 제네릭 정적 메소드 
		clients = Collections.<String, Socket> synchronizedMap(clients);
		//Collections-Collection의 helper class 
		
		log.debug("synchronized client list created. type:{}", clients.getClass().getName());
	}//Default constructor
	
	
	private void start() {
		log.trace("start() invoked.");
		
		try(ServerSocket serversocket = new ServerSocket(port)){
			log.debug("Server started.");
			
			while(true) {
				
				log.debug("Listening on {} ...", serversocket);
				Socket sock = serversocket.accept();
				log.debug("Client Connected From {}", sock);
				
				//별도의 쓰레드로 다수의 클라이언트가 보낸 메세지를 수신할 수있는 task를 처리 
				ServerReceiver receiver = new ServerReceiver(sock); //worker 쓰레드객체생성
				receiver.start(); 									//worker 쓰레드 시작 
			}//while
			
		} catch ( IOException e) {
			e.printStackTrace();
		} finally {
			log.info("Server finished.");
		}//try-with-resource 
	}//start
	
	@Log4j2
	static class ServerReceiver extends Thread{
		final Socket sock;
		final String clientKey;
		
		ServerReceiver(Socket sock){
			log.trace("constructor({}) invoked.", sock);
			
			this.sock=sock;
			this.clientKey= sock.getRemoteSocketAddress().toString();
			
			clients.put(this.clientKey, sock);
			log.debug("clients : {}", clients);
			
			try {
				String WELCOME = String.format("<<<client Key: %s Entered. Welcome !!!", this.clientKey);
				//현재 연결된 모든 클라이언트에게 동일 메세지 전송해주는 메소드 호출 
				publish("SERVER", WELCOME, true);
			}catch (IOException e) {
//				e.printStackTrace();
				
				//통신(입/출력)에 문제가 발생한 클라이언트는 Map에서 삭제처리 
				clients.remove(this.clientKey);
				log.debug("client : {}", clients);
				
				try {
					String BYE = String.format(">>> Client Key: %s Exited. Bye!!!", this.clientKey);
					
					//현재 연결된 모든 클라이언트에게 동일 메세지 전송해주는 메소드 호출 
					publish("SERVER", BYE, true);
				} catch (IOException e1) {;;}
			}//try-finally
		}//constructor 
		
		
		@Override
		public void run() {
			log.trace("run() invoked.");
			
			try (this.sock){
				InputStream is = this.sock.getInputStream();
				
				//보조스트림은 기본스트림에 연결해서쓰는 스트림이 아닌 
				//JVM 메모리에 바이트 데이터를 보관하기 위하여 사용하는 보조스트림
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				
				try(is; baos;){
//					----
//					1. RECEIVE MESSAGE FROM ALL CLIENTS 
//					----
					int CR=13, LF=10;
					
					int ch;
					String RECV = null;
					
					while( (ch=is.read()) != -1) {
						if(ch != CR && ch != LF) {
							baos.write(ch);
						} else {
							if( ch==LF) {
								RECV = baos.toString(charset);
								log.info("RECV from {}:{}", this.clientKey, RECV);
								
								baos.reset();
								
//								---
//								2.PUBLISH MESSAGE TO ALL CLIENTS
//								---
								publish(this.sock.getRemoteSocketAddress().toString(), RECV, false);
								
							}//if
						}//if-else
					}//while : is.read()!=-1
				}//try-resource: is, baos
				
			} catch ( IOException e) {
//				e.printStackTrace();
			} finally {
				log.info("Client {} Disconnected", this.sock);
				
				clients.remove(this.clientKey, this.sock);
				log.debug("clients: {}", clients);
				
				try {
					String BYE = String.format(">>> Client Key: %S, Exited. Bye !!!", this.clientKey);
					publish("SERVER",BYE,true);
				} catch (IOException e1) {;;}
			}//try-with-resource : this.sock
		}//run
	}//main
	
	private static void publish(String fromKey, String message, boolean toSelf) throws IOException {
		log.trace("publish({}, {}) invoked.", fromKey, message);
		
		Set<String> keys = clients.keySet();
		
		for(String key : keys) {
			log.debug("publish to the client key: {}", key);
			
			if( !key.equals(fromKey) || toSelf) {
				
				int CR=13, LF=10;
				
				Socket sock = clients.get(key);
				OutputStream os = sock.getOutputStream();
				
				os.write((fromKey+": "+message).getBytes(charset));
				os.write(CR);
				os.write(LF);
				
				os.flush();
				log.info("SENT from {}: {}", fromKey, message);
			
			} else {
				log.debug("Excluding client itself key:{} to publish", fromKey);
			}//if-else
		}//enhanced for
	}//publish
	
	public static void main(String[] args) {
		log.debug("main({}) invoked.", Arrays.toString(args));
		
		new S10_MultiChatServer().start();
	}//main
	
}//end class
