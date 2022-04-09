package IO.Thread;

import java.awt.Toolkit;

import lombok.NoArgsConstructor;


//함수적 인터페이스 Runnable 구현하는 구현클래스 선언 
@NoArgsConstructor
public class BeepTask implements Runnable {@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			
			try {Thread.sleep(500); }
			catch (Exception e) {;;}
		}//for
	
	}//run
}//end class 
