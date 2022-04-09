package IO.Thread;

import java.awt.Toolkit;

//Thread class 상속받는 자식클래스를 만들고, 
//run()메소드를 재정의하여 새로운 쓰레드 객체 생성 
public class BeepThread extends Thread{

	@Override
	public void run() {
		System.out.println("BeepThread::run() invoked.");
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); }
			catch (Exception e) {;;}
		}//for
	}//run
}//end class
