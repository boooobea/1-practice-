package Operator;


public class CompareOperatorExample1 {
	//비교연산자(이항, binary operator)=>대소를가린다. 결과타입 : boolean(true/false)
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1 = "+result1);
		System.out.println("result2 = "+result2);
		System.out.println("result3 = "+result3);
		
		
	}//main

}//end class
