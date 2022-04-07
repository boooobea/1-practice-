package IfForWhile;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1; 					//(1)초기식 : 카운터 변수 정의
		
		while(i<=10) {				//(2)조건식 : 평가 
			System.out.println(i);
			
			i++;					//(3)증감식
		}//while
		
	}//main
}//end class
