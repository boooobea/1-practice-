package StudyPaper;

public class Singleton {
//Singleton - Singleton Design Patton 
//heap 영역에 단 한번만 생성되는 객체를 만든다.
	
	
	private static Singleton singleton = new Singleton();
	
		/* 각종 데이터를 필드로 저장 */
	
	static {
		singleton = new Singleton(); 
	}//static initializer               //static field이기 때문에 자동생성된다. 
		
		//1)static initializer : JVM -> 메소드영역의 메모리인 clazz객체에 들어가기 전에 실행
		//	생성자보다 가장 먼저 호출되어서 heap area에 단 한번만 객체가 생성된다. 
		//2)클래스는public으로 공공이나 private으로 감추어서 외부 클래스의 접근을 막는다.  
		//  만들어진 객체를 보호한다.
	
	
	private Singleton() {				//private constructor:외부에서 접근하여 객체생성할수 없게 막는다.
		;; 								
	}//default constructor
	
	
	static Singleton getInstance() {	//static method: 외부클래스에서 메서드호출로 접근가능
		return singleton;
	}//getInstance
	
	
}//end class
