package Operator;

public class Sample9 {
	public static void main(String[] args) {
		int value = 100;
		//Q. value의 변수값이 소수인지 판단하라.(1과 자기자신만으로 나누어 떨어지는 수)
		
		if((value%1==0) & (value%value==0)) {
			System.out.println("소수(prime number)입니다");
		}
		
//		----
		
//		int value = 100;
//		//Q. value의 숫자는 50보다 크고 90보다 작다.의 조건식 
//		
//		if( (value>50) & !(value<90) ) {
//			System.out.println("거짓입니다.");
//		}
	}//main
}//end class
