package ObjectClass;

public class CalculatorStaticExample {

	public static void main(String ... args) {
		
		double radius = 10.0; 		// 원의 반지름
		
		double result1 = radius * radius * CalculatorStatic.pi;
		
		int result2 = CalculatorStatic.plus(10, 5); //클래스명(.) -> 정적멤버를 쓰는것
		int result3 = CalculatorStatic.minus(10,5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		
		
	}//main
	
}//end class
