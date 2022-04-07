package Operator;


public class CharOperationExample {
	
	// 문자타입(char)을 이용해서, 연산수행 예제 
	public static void main(String[] args) {
		//1.대전제1 - 정수연산식의 결과는 int타입이다.
		//2.대전제2 - 리터럴은 형변환을 하지 않는다.(!!!)
		char c1 = 'A'+1;
		char c2 = 'A';
		int c3 = c2 + 1;
		
		System.out.println("c1: "+c1);
		System.out.println("c2: "+c2);
		System.out.println("c3: "+ (char)c3);
				
			
		
	}//main
}//end class
