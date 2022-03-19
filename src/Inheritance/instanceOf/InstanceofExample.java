package Inheritance.instanceOf;


//다형성-1에 의해, 부모타입의 참조변수에 저장되어있는 자식객체를 다시 빼낼때(강제형변환),
//자식타입을 잘못알고 하면, ClassCastException 예외가 발생가능.
//먼저, 자식타입을 검사 후 맞으면, 그때 안전하게 강제형변환을 통해 빼내야한다. 
//**instanceof** 라는 연산자가 필요
public class InstanceofExample {

	public static void method1(Parent parent) {	//*** 매개변수의 다형성-1
	
			System.out.println("InstanceofExample::method1() invoked.");
			
		//instanceof 이항 연산자의 용법 
		//항1(참조타입면수) instanceof , 항2(참조타입명)
		
		if(parent instanceof Child) {			//*** 강제형변황을 검사하는 코드  
			Child child = (Child) parent;		//안전하게 강제형변환 수행1)
			
			System.out.println("method1-child로 변환 성공");
			
		} else {
			System.out.println("method1 - child로 변환되지 않음");
		}//if-else
	}//method1
	
	
	public static void method2(Parent parent) {	//*** 매개변수의 다형성-1
		
		System.out.println("InstanceofExample::method2() invoked.");
		
		Child child = (Child) parent;			//안전하지 않은 강제형변환 수행2)
		System.out.println("method2 - child로 변환성공");
	}//method2
	
	
	public static void main(String[] args) {
//		Parent parentA = new Child();			//다형성 - promotion
//		
//		InstanceofExample.method1(parentA);		//매개변수의 다형성-1 ok
//		InstanceofExample.method2(parentA);		//정적멤버 사용법 숙지(클래스명.메소드명)
		
//		---
		
		Parent parentB = new Parent();			//parent의 객체 생성!! 
		
		InstanceofExample.method1(parentB);		//매개변수의 다형성-1 xx
		InstanceofExample.method2(parentB);		//매개변수의 다형성-1 xx, 예외발생
		
	}//main
	
	
}//end class
