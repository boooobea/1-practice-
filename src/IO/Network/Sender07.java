package IO.Network;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.FileSystemLoopException;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Sender07 extends Thread {
	private Socket sock;
	private OutputStream os;
	
	Sender07(String threadName, Socket sock){
		log.debug("Constructor({}) invoked.", sock);
		
		this.sock = sock;
		super.setName(threadName+"-"+super.getName());
		
		try { this.os = this.sock.getOutputStream(); } catch (IOException e) {;;}
	}//constructor
	
	@Override
	public void run() {
		log.debug("run() invoked.");
		
		try { 
			ObjectOutputStream oos = new ObjectOutputStream(this.os);
			
			try(oos){
				for(int i=0; i<10; i++) {
					String message = "보내는 메세지-" +i;
							
					oos.writeObject(message);
					oos.flush();
					
					log.info("SENT: {}", message);
					
					Thread.sleep(1000*1);
				}//for
			}//try-with-resource
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { this.os.close(); } catch(IOException e) {;;}
			try { this.sock.close(); } catch (IOException e) {;;}
		}//try-catch-finally
		
		log.info("Done.");
	}//run
	
}//end class
