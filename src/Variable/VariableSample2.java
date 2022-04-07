package Variable;

public class VariableSample2 {
	{
		;; //pass : 아직 실행문장을 완성하지 못하거나, 준비가 안되었다.
	}
	{
		;;
	}

	//변수 : 정의 + "유효범위"
	//일반화 요약 : 
	//(1)변수의 유효범위는, 자신이 선언된 블록 내부에서만 유효하다.
	//(2)변수는 자신의 유효범위가 끝나는 순간, 메모리에서 '파괴'된다. 
	public static void main(String[] args) {
	//변수의 유효범위:정의된 변수를 사용가능한 범위 
		
//		int age= 40;
//		{
//			int age = 23;
//		
//			System.out.println(age);
//		}// 사용자 정의 블록 (User-defined block),#1
//		{
//			int age = 23;
//			
//			System.out.println(age);
//		}// 사용자 정의 블록 (User-defined block),#2
		//사용자정의블록은 클래스클래스 안에 어느곳이든 유효하다.
		
//		System.out.println(age);
		
//		if(true) {
//			{
//				;;
//			}
//		}
		
		//변수의 구분 : (1)지역변수 (2)전역변수(자바에서는xxx)
		int age;
		
	}//main
}//end class
