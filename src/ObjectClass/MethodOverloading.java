package ObjectClass;

public class MethodOverloading {
	
	void method() {;;}
	
	void method(String name) {}
	
	void method(String name, int age) {;;}//오버로딩에서 변수이름은 제외 
											//매개변수의 타입의 순서 
	void method(int age, String name) {;;}

	void method(String name, int whigt) {;;}//매개변수의 변수타입이 같으면 순서바뀌었을때 
											//오버로딩이 성립되지 않음 
	void method(String name, int age, int weigt) {;;}
	void method(String name, int age, int weigt, float height) {;;}
	//오버로딩 - 타입, 개수, 순서가 달라야한다(같은 매개변수는 순서를 일정하게 유지) 
	
	void method(String name, int age) {;;}
	int method(String name, int age) {;;} //반환타입이 int이기때문에 
								// [return 0;]return 값을 반환타입으로 해줘야한다. 
	//오버로딩 - 반환타입은 상관없다.
}//end class 

	
	//default constructor
	//클래스 내부에서 다른메서드 호출할때는 (.)참조변수 호출이 필요 없다. 
	//클래스 내부에서 사용할때는 this()를 사용(***)
	
	String name = "bibian";
	static int age = 23;
	
	
	void method1() {
		System.out.println("method1() invoked");
		System.out.println("name : " + this.name); 	//this. <- 클래스 필드의 name
		System.out.println("age : " + TTT.age); 	//TTT.	<-클래스의 static 필드사용 
		
		String name= "nonono"; 					   //메서드 내부의 지역변수name 
		this.method2(); 				//다른메소드 호출
	}//method1 
	
	void method2() {
		System.out.println("method2() invoked");
		
		this.method3(); 				//다른 메소드 호출 
	}//method2
	
	void method3() {
		System.out.println("method3() invoked");
	}//method3
	
	
	
}//end class
