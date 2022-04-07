package ObjectClass;

public class CalculatorStatic{

//	static double pi = 3.14159;
	static double pi;

	static {				//static initializer	
		System.out.println("static initializer invoked");
		
//		pi = 3.14159;
		pi = Math.PI;		//상수는 대문자로 작성 
	}//static initializer
		
	//----------- 없으면 컴파일러가 생성, 값이 없으면 초기값으로 초기화 
	//----------- 위치나 개수에 상관없이 컴파일된 코드는 하나로 처음에 실행된다. 
	//----------- 정적필드를 초기화할때 생성. 
	//----------- clazz 객체에 소속되어 메소드메모리에 저장된다. 
	static int plus(int x, int y) {
		return x + y;
	} //plus
	//-----------
	
	static {
		System.out.println("static initializer invoked2");
	}//static initializer 2
	
	static int minus(int x, int y) {
		return x - y;
	} //minus
	
	//-----------
	static {
		System.out.println("static initializer invoked3");
	}//static initializer 3
	//-----------
	
}//end class
