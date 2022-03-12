package StudyPaper;
//----내부클래스 

public class Television {
//static initializer - instance/static
	
	static String company = "Samsung";			//정적필드 
	static String model = "tv";
	static String info;
	
	double price; 								//인스턴스필드 
	
	static {									//static initializer
		info = company + " - " + model;
	}//static initializer-복잡한 로직을 통하여 초기화 할때는 static initializer 선언필요
	
	
	
	void instanceMethod1() {			//인스턴스 메소드
		System.out.println(this.price);			//ok : 인스턴스 필드 사용
		System.out.println(Television.model); 	//ok : 정적 필드 사용
		
		this.instanceMethod2();					//ok : 인스턴스 메소드 사용 
		Television.staticMethod();				//ok : 정적 메소드 사용가능
		
		/* 다른클래스의 메소드를 호출 */
		TVTV tv = new TVTV();
		tv.instanceMethod();					//ok : 객체 생성 후 인스턴스메소드 사용
		TVTV.staticMethod();					//ok : 정적메소드 사용(클래스.)
	}//intstanceMethod

	
	void instanceMethod2() {			//인스턴스 메소드
		System.out.println(this.price); 		//ok : 같은클래스 내부에서는 객체 생성 없이 사용가능 
	}//instanceMethod
	
	
	static void staticMethod() {		//정적 메소드
		System.out.println(Television.model);	//ok : 정적 필드 사용 
		Television tv = new Television();		
		System.out.println(tv.price);			//ok : 객체 생성 후 인스턴스 필드 사용 
	}//staticMethod
	
}//end class

//---- 외부클래스라고 가정 
class TVTV {
	
	void instanceMethod() {} 
	static void staticMethod() {}
	
}//end class 