package IO.Thread;

import java.awt.Toolkit;


//Worker-Thread(Runnable) 
public class BeepPrintExample2 {

	public static void main(String[]args) {
		//1. 작업스레드 만드는 첫번째 방법 
		
		//---1.Task
		Runnable beepTack = new BeepTask();
		Thread thread1 = new Thread(beepTack); //Runnable 구현 클래스를 매개변수로 지정 
		thread1.start(); //start():Thread 실행 
		
		//---2.Task
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch (Exception e) {;;}
		}//for 
		
//		--- 
		
		//2. 작업스레드 만드는 두번째 방법 
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Anonymous::run() invoked.");
				
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); }
					catch(Exception e) {;;}
				}//for
			}//run
		});//익명구현객체 코딩기법으로 만든 익명구현객체 
		
		thread2.start();
		
		//---2.Task
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch (Exception e) {;;}
		}//for 
		
//		---
		
		//3. 작업스레드 만드는 세번째 방법 
		Thread thread3 = new Thread( () ->{
			System.out.println("Lamda::run() invoked.");
			
			Toolkit toolkit = Toolkit.getDefaultToolkit(); 
			for(int i=0; i<5; i++) {
				toolkit.beep();
				try { Thread.sleep(500); }
				catch (Exception e) {;;}
			}//for
		}); // 람다식을 이용한, 익명구현객체
		
		thread3.start();
		
		//---2.Task
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch (Exception e) {;;}
		}//for 
	}//main
}//end class
