package Inheritance.abstract1;



public class PhoneExample {

	public static void main(String[] args) {
		
		Phone phone = new Phone();
		//abstract 클래스는 객체 생성을 할 수 없다. 
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		smartphone.turnOn();		
		smartphone.turnOff();
		smartphone.internetSreach();		//자식객체 메소드 호출 
		
		
	}//main
	
}//end class
