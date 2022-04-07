package Operator;

public class AssinnmentOperatorExample {
	//복합 대입연산자 예제
	public static void main(String[] args) {
		int result = 0;
		
//		result += 10;
		result = result + 10;
		System.out.println("result= "+result);
		
//		result -= 5;
		result = result -5;
		System.out.println("result="+result);
		
//		result *= 3;
		result = result*3;
		System.out.println("result="+result);

//		result /= 5;
		result = result / 5;
		System.out.println("result"+result);
		
//		result %= 3;
		result = result & 3;
		System.out.println("result"+result);
		
		//Q.복합대입연산자로, result의 변수의 값을 1 증가시키는 코드를 만들어라
		result = 100;
//		result = result + 1;
		result += 1;
		System.out.println("result"+result);
		
		
	}//main
}//end class
