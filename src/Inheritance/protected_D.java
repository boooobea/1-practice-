package Inheritance;


public class protected_D extends protected_A{

	//부모의 protected 멤버는 사용관계의 사용이 아닌 
	//자식의 생성자 내부에서 호출가능을 말한다. 
	//부모의 필드, 메소드의 접근제한자가 default-private일 경우 호출 할 수 없다.
	public protected_D() {
		super();				//자식생성자 내부->부모생성자호출 super()
		
		this.field = "bibi";	//상속받은 자식의 protected 필드, 메소드 호출 
		this.method();
//		---
		super.field = "bobo";	//부모의 protected 필드, 메소드 호출 
		super.method(); 		// ---super. this. 메소드 오버라이드 사용에 유의 
		System.out.println(super.field); // ---super. 부모의 필드호출
		
	}//default constructor
/*
	void method3() { 			
	A a = new A();				//public constructor 일때 : 객체생성은 가능하지만 
	a.field = "nono";			//상속이 아닌 사용관계기 때문에 
	a.method();					//접근제한자에 의해 필드, 메소드 사용불가 
	}//method3
	
	void method2() { 			
	A a = new A();				//protected constructor 일때 : 객채생성불가 
	}//method2
*/	
	
	@Override
	public 
	void method() {				// ---A 오버라이드 D 
		System.out.println("D :: method() invoked.");
	}//method
	
	public static void main(String[] args) {
		protected_D d = new protected_D();			// 자식클래스의 객체 생성 후 
		d.method(); 			// 메소드 호출시 오버라이드 된 자식의 메소드 호출 
		
	}//main
}
