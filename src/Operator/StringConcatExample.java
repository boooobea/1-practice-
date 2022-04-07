package Operator;

public class StringConcatExample {
	//문자열 연결(string concatenation) 연산자 : '+'
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		
		System.out.println(str1);
		System.out.println(str2);
		
//		----
		// 표현식(Expession, 연산식) 이 아무리 많은 연산자와 피연산자로 구성되어 있더라도
		// 그 실행결과는 단 1개의 값(스칼라 scalar)이 생성
		// 표현식의 구성이 아무리 복잡해도, 단 한개의 항이라도 문자열이 있으면, 결국 실행결과는 문자열 
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		
		System.out.println(str3);
		System.out.println(str4);

	}//main
	
}//class
