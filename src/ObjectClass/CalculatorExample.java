package ObjectClass;

import java.util.Arrays;

public class CalculatorExample {

	public static void main(String[] args) {
		System.out.println("args : " +Arrays.toString(args));
		Calculator mycalc = new Calculator(); // 전자계산기 객체 생성
		mycalc.powerOn(); 					  //메소드 호출
		
//		--- 
		
		int result1 = mycalc.plus(5, 6);	  //메소드 호출
		System.out.println("result1 : " + result1);
	
//		---
		
		byte x = 10;
		byte y = 4;
		double result2 = mycalc.divide(x, y); //메소드 호출 
		System.out.println("result2 : " + result2);
		
		mycalc.powerOff();
		
	}//main
}//end class
