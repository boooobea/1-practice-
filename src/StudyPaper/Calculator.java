package StudyPaper;

public class Calculator {
//static initializer
	
	/* static double pi = 3.14159;
	
	아래와 같이 static initializer 호출된다 */
	
	static double pi;					//정적필드
	static int staticfield;
	
	static {							//static initializer-정적필드 초기화 
		pi = 3.14159;
		staticfield = 0;
	}//static initializer 
	
	//----------- 없으면 컴파일러가 생성, 값이 없으면 초기값으로 초기화 
	//----------- 위치나 개수에 상관없이 컴파일된 코드는 하나로 처음에 실행된다. 
	//----------- 정적필드를 초기화할때 생성해준다. 
	//----------- clazz 객체에 소속되어 메소드메모리에 저장된다. 

	
	
//	static double 
	static int plus(int x, int y) {
		return x + y;
	}//puls
	
	static int minus(int x, int y) {
		return x - y;
	}//minus
	
	
	
}//end class
