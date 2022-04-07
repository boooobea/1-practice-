package ObjectClass;

//----내부클래스 
public class Television {
//static initializer-instance-static 
	
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	double price;
	
	static {
		info = company + " - " + model;
	}//static initializer ---- 복잡한 로직을 통하여 초기화 할때는 static initializer 선언필요 
	
//------- 인스턴스멤버, 정적멤버 사용 	
		
	void instanceMethod1() {				//인스턴스 메서드 
		System.out.println(this.price); 		//ok : 인스턴스 필드 사용(this.)
		System.out.println(Television.model);	//ok : 정적 필드 사용(class.)
		
		this.instanceMethod2();					//ok : 인스턴스 메소드 사용(this.) 
		Television.staticMethod();				//ok : 정적 메소드 사용가능(class.)
		
		
		/* 다른클래스의 메소드를 호출 */
		TVTV tv = new TVTV();
		tv.instanceMethod2();					//ok : 객체 생성 후 인스턴스메소드 사용
		TVTV.staticMethod();					//ok : 정적메소드 사용(클래스.)
	}//instanceMethod
	
	
	void instanceMethod2() {				//인스턴스 메서드 
		System.out.println(this.price);			//ok : 같은클래스 내부에서는 객체 생성 없이 사용가능 
	}//instanceMethod
	
	
	static void staticMethod() {			//정적 메소드
		System.out.println(Television.model);	//ok : 정적 필드 사용 
		Television obj = new Television();		
		System.out.println(obj.price);			//ok : 객체 생성 후 인스턴스 필드 사용  
	}//staticMethod
	
}//end class

//---외부클래스
class TVTV{
	
	void instanceMethod2() {}				//instanceMethod
	static void staticMethod() {}			//staticMethod
	
}//end class 