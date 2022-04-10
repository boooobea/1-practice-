package IO.Network;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Receiver01 extends Thread{
	private Socket sock;		//ServerSocket이 생성한 Socket 객체 보관 
	private InputStream is;		//Socket 객체에서 얻어낸 입력스트림 보관 
	
	public Receiver01(
			String threadName, 	//데이터 수신스레드 이름
			Socket sock			//ServerSocket이 생성한 Socket의 객체 
		) {
		log.debug("constructor({}) invoked", sock);
		
		this.sock=sock; //인스턴스필드 초기화 
		super.setName(threadName+"-"+super.getName()); //스레드의 이름 설정 
		
		// Socket으로부터 데이터 수신을 위한 입력스트림 추출, 필드에 설정(보관) 
		try { this.is = this.sock.getInputStream(); }
		catch (IOException e) {;;}
	}//constructor
	
	
	//부모클래스 Thread가 물려준 run()메소드를 재정의
	@Override
	public void run() {
		log.debug("run() invoked.");
		
		//자바입출력을 위한 보조스트림, 바이트단위의 데이터를 메모리에 보관할 수 있다. 
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		try(baos){	
			
			int ch;
			int CR=13, LF=10; 	//Enter Key codes
			
			while( (ch=is.read()) != -1) {		//EOF(-1)
				
				if(ch!=CR && ch !=LF) { 		//수신된 바이트값이 CR,LF가 아니면 
					baos.write(ch);				//보조출력스트림에 저장 
				} else {
					
					if( ch==LF) {
						//보조출력스트림에 저장된 모든 바이트열을 문자열로 변환 
						String recv = baos.toString("utf-8");
						log.info("RECV:{}", recv); 		//콘솔에 출력
						
						baos.reset(); 	//바이트열 보조스트림 내부를 비움(공장모드) 
					}//if
				}//if-else
			}//while
		} catch (Exception e) {;;}
		finally { //스트림 -> 소켓순서로 닫음 
			try { this.is.close(); } catch (IOException e) {;;}
			try { this.sock.close(); } catch (IOException e) {;;}
		}//try-catch-finally
		
		log.info("Done.");
	}//run
}//end class
