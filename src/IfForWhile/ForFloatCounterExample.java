package IfForWhile;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		//카운터변수의 값으로 '실수'를 사용해서는 안된다.근사치로 표현되기 때문에 부작용이 생긴다. 
		//즉, 정수를 카운터 변수의 값으로 사용해야 한다.
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}//for
		
	}//main

}//end class
