package StudyPaper;

import java.util.Arrays;

public class CalculatorMethodEx01 {
		//Method = >리턴타입 메서드이름(){} // 매개변수
		
		public static void main(String[] args) {
			System.out.println("args : " + Arrays.toString(args));
			CalculatorMethod mycalc = new CalculatorMethod(); // 전자계산기 객체 생성
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

