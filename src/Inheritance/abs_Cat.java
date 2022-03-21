package Inheritance;


public class abs_Cat extends abs_Animal {

	
	public abs_Cat() {
		this.kind = "포유류";
	}//constructor
	
		
	/* 부모인 추상클래스에 선언된, "추상메소드"를 반드시 구현(오버라이드)해야한다.
	 * 만일, 자식클래스에서 구현(재정의)하지 않으면 자식클래스조자 "abstract"키워드로
	 * 추상클래스화 해야한다. */
		@Override
	public void sound() {
		System.out.println("야옹");
	}//sound
	
	
}//end class
