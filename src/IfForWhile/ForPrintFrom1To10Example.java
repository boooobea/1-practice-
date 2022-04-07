package IfForWhile;

public class ForPrintFrom1To10Example {
	// 1+2+3+...+10 = ???
	public static void main(String[] args) {
		//(1)초기식 : 변수를 정의(단 한번만 수행)
		//(2)조건식 : for block을 반복수행할지/말지를 결정 
		//(3)증감식 : (1)에서 정의한 변수의 값을 변경 
		
		int i=1; //(1) 카운터 변수 (2) 루프제어변수
		
		for( ; ; ) {//무한루프
			if(i<=10) { //탈출조건(if-else, break) 
				System.out.println(i);
			}else{//for문 끝내기.
				break;
				//if
			}
			++i;
		}//for 
//			System.out.println(i);
		
		
	}//main
}//end class
