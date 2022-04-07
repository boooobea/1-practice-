package Operator;


public class DenyLogicOperatorExample {
	
	//부정연산자 NOT(!)의 사용예--> 토글(toggle)
	//Toggle is like a swhtch.
	public static void main(String[] args) {
		
		boolean play = true;
		System.out.println("1. "+play);
		
		play = !play;
		System.out.println("2. "+play);
		
		play = !play;
		System.out.println("3. "+play);
		
	}//main
}//end class
