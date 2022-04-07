package IfForWhile;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i<=100) {	
			sum += i;				//복합대입연산자
			//sum = sum + i;
			i++;
			
		}//while
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
		
	}//main

}//end class
