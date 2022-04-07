package ObjectClass;

public class CalculatorExample01 {

	public static void main(String[] args) {
		
		Calculator01 myCalcu = new Calculator01();	//1.인스턴스생성
		
		double result1 = myCalcu.areaRectangle(10);	//2.메소드호출
		
		double result2 = myCalcu.areaRectangle(10, 20);//3.메소드호출
		
		//결과 출력 
		System.out.println("정사각형의 높이 = "+result1);
		System.out.println("직사각형의 높이 = "+result2);
		
	}//main
}//end class
