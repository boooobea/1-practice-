package IO.Thread;

import java.awt.Toolkit;

//Single Thread 
public class BeepPrintExample1 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {  		//1st. Task 
			toolkit.beep();				//소리출력
			
			try { Thread.sleep(500); } catch (Exception e) {;;} 
			//sleep : 스레드의 실행흐름을 지정된 시간동안 잠시멈춤 
		}//for
		
//		---
		
		for(int i=0; i<5; i++) {		//2st. Task
			System.out.println("띵");	//콘솔출력 
			
			try { Thread.sleep(500); } catch (Exception e) {;;}
		}//for 
		
	}//main
}//end class
