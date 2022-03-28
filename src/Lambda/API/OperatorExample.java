package Lambda.API;

import java.util.function.IntBinaryOperator;


//함수적 인터페이스(Operator) 
public class OperatorExample {

	private static int[] scores = { 92, 95, 87};
	
//	int applyAsInt(int left, int right);
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0]; //첫번째 원소의 값을 임시 결과로 지정 
		
		for(int scores : scores) {	//배열의 원소를 차례대로 순회
			result = operator.applyAsInt(result, scores);	//추상메소드 호출(다형성-2)
		}//enhanced for
		
		return result;
	}//maxOrMin
	
	public static void main(String[] args) {
		
		//1. 최대값 얻기 
//		int applyAsInt(int left, int right);
		int max = maxOrMin( 
				(a, b) -> {
					if(a>=b) return a;
					else return b; 
					}//람다식 : 최대값을 가지는 원소를 추출하는 익명구현객체 생성 
				);
		System.out.println("최대값 : " + max);
		
		int min = maxOrMin( 
				(a, b) -> { 
					if(a <=b) return a; 
				else return b;
				}//람다식
			);
		System.out.println("최소값 : " + min);
		
		
	}//main
	
}//end class
