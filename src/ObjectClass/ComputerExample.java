package ObjectClass;

public class ComputerExample {

	public static void main(String ... args) {
		
		System.out.println("args:" + args);
		
//		---
		
		Computer mycom = new Computer();
		
		int[] values1 = {1, 2, 3};
		int result1 = mycom.sum1(values1); 			//메소드 호출: 매개변수는 배열
		System.out.println("result1 : " + result1);
		
//		---
		
		int result2 = mycom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2 : " + result2);
		
//		---

		mycom.sum2();//호출 메소드의 리턴값을 사용할 곳이 없으면 Lvalue 구성을 하지 않는다.  

		//		---
		//가변인자 매개변수에서 int는 제일 끝으로 
		int result3 = mycom.sum2(1,2,3);
		System.out.println("result3 : " + result3);
		
//		---
		
		int result4 = mycom.sum2(1,2,3,4,5);
		System.out.println("result4 : " + result4);
		
		
	}//main
}//end class
