package IO.Network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Sender01 extends Thread {
 
	private Socket sock;
	private OutputStream os;
	
	Sender01(String threadName, Socket sock){
		log.debug("Constructor({}) invoked.", sock);
		
		this.sock = sock;
		super.setName(threadName+"-"+super.getName());
		
		try { this.os = this.sock.getOutputStream(); }
		catch(IOException e) {;;}
	}//constructor
	
	@Override
	public void run() {
		log.debug("run() invoked.");
		
		try {
			//Handshake Protocol 대로 메세지 보냄
			int CR = 13,  LF =10;
			for(int i=0; i<10; i++) {
				
				String message = "클라이언트메시지-" + i;	//전송 메세지 생성
				os.write(message.getBytes("UTF-8"));		//전송 메세지 문자열 -> 바이트열로 변환 송신
				
				//Sent CRLF ***
				os.write(CR);
				os.write(LF);
				
				os.flush();	//강제flushing
				
				log.info("SENT:{}",message);
				
				Thread.sleep(1000*1); //1초간격으로 
			}//for
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //자원해제 : 출력스트림 -> 소켓닫는 순서 
			try { this.os.close();} catch (IOException e) {;;}
			try { this.sock.close(); } catch (IOException e) {;;}
		}//try-catch-finally
		
	}//run
}//end class
