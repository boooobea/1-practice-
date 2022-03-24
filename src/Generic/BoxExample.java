package Generic;


public class BoxExample {

	public static void main(String[] args) {
		
		//제네릭타입 클래스로부터 인스턴스 생성
//		Box<String> box1 = new Box<String>();  //@until7
		
		// Rvalue 의 <> : 타입 추론 연산자 
		Box<String> box1 = new Box<>();  		//@until8
		
		box1.setT("hello");						//set
		String str = box1.getT();				//get
		
		System.out.println("box1 : " + box1);
//		---
		
		//제네릭타입 클래스로부터 인스턴스 생성
//		Box<Integer> box2 = new Box<Integer>();
		Box<Integer> box2 = new Box<>();
		box2.setT(6);
		int value = box2.getT();
		
		System.out.println("box2 : " + box2);
		
//		---
		
		//정수타입 : 	참조타입(Wrapper Type)
		// byte  	---> Byte
		// char		---> Character
		// short 	---> Short
		// int 		---> Integer
		// long  	---> Long
		// 실수타입: 
		// float 	---> Float 
		// double  	---> Double 
		// 논리타입 : 
		// boolean  ---> Boolean 
		
		
	}//main
	
}//end class
