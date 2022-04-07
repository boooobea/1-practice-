package ObjectClass;

public class Calculator01 {
	//field
	String colod;			//인스턴스필드
	double price = 19.3; 				
	
	
//method overloading 
	//1. 정사각형의 넓이
	double areaRectangle(double whidth) {
		return whidth * whidth;
	}//areaRectangle
	
	
	//2. 직사각형의 넓이 
	double areaRectangle(double whidth, double height) {
		return whidth * height;
	}//areaRectangle
	
	//3. 덧셈구하기
	//클래스의 필드, 메서드의 도움없이 메서드를 수행할 수있기 때문에 static메서드(**)
	static int add(int number1, int number2) { 
		return number1+number2;
	}
	
	
}//end class
