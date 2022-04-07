package Variable;

public class VariableSample1 {
	public static void main(String[] args) {
		//int(정수만 입력가능):변수에 저장가능한 값의 유형을 의미
		int number = 10;
		
		//Lvalue(변수선언) = Rvalue(변수의 초기값)
		int age = 1+2+3+4; // age이름의 변수를 '정의'한다.
		
		//변수의 정의 = 변수선언 + 초기화(초기값을 넣어줌)
		//변수는 "정의"까지 완성되어야만 사용가능하다(***)
		//문자열 = 여러개의 문자들을 엮어놓은것을 의미 
		String name = "bibian";
		
		age = 23;
		name = "김보배";
		name = "김뫄뫄";
		
		// 1: 남성, 2:여성
		final int gender = 1;
//		gender = 2;
	
				
		
		System.out.println(name);
		
		
		
	}//main
}//end class
