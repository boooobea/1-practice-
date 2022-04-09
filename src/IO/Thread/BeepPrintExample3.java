package IO.Thread;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		
		//how1 - 자식쓰레드클래스 이용하여 스레드 객체 생성 
		Thread thread1 = new BeepThread();
		
		thread1.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); }
			catch (Exception e) {;;}
		}//for
		
		
		
		//how2 - 익명자식객체 생성 
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); }
					catch (Exception e) {;;}
				}//for
			}//run
		}; //익명자식객체 생성 (익명구현객체와 동일)
		
		thread.setName("cccoding-thread"); //default naming rule : Thread-N 
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); }
			catch (Exception e) {;;}
		}//for
		
	}//main
}//end class
