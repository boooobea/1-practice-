package Interface.promotion;


/* 완성된 클래스에, 집합(부품)관계로 
 * 부모타입인 인터페이스 타입으로 선언하고, 필드를 초기화 할때는
 * 다형성-1에 의거해서 구현객체(자식)을 넣는다.
 */
public class Car {

	//Lvalue: 부모타입, Rvalue :자식타입
	//다형성-1(부품장착)
	Tire frontLeftTire = new HankookTire();
	Tire fronRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	
	void run() {
		//다형성-1 : 부모타입의 필드에 메소드 호출 
		//다형성 1 : 대입된 자식(구현)객체의 재정의된 메소드가 호출 
		frontLeftTire.roll();
		fronRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}//run	
	
	
}//end class
