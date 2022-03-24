package Generic;


public class BoundedTypeParameterExample {

	
	/* 제한된 타입 파라미터를 가진 제네릭 메소드를 '사용'할 때 
	 * 구체타입을 아무것이나 지정못하고, 오로지 Number 타입 또는 자식만 지정 가능*/
	public static void main(String[] args) {
		
		int result1 = Util_1.<Double>compare(10.0, 20.0);
		System.out.println(result1);
		
		/* compare (두개의 대 소를 비교하는 메소드) 
		 * 자바표준라이브러리에서 정렬등을 수행하기 위해서 비교결과를 반환하도록 되어있다.
		 * if(number1 == number2) --> return 0
		 * if(number1 < number2)  --> return <음수값> : 보통 -1 반환
		 * if(number1 > number2)  --> return <양수값> : 보통 +1 반환  */
//		---
		
		int result2 = Util_1.<Double>compare(4.5, 3.0);
		System.out.println(result2);
		
	
	}//main
	
}//end class
