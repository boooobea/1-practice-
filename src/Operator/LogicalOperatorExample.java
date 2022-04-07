package Operator;


public class LogicalOperatorExample {
	public static void main(String[] args) {
		
		int charCode = 'A'; // 65 정수 대입

		if( (charCode>=65) & (charCode<=90) ) { //조건식1 과 조건식2 실행후 결과 산출(양쪽모두결과산출)
			System.out.println("대문자 이군요");
		}
		if( (charCode>=97) && (charCode<=122) ) { //쇼트써켓팅(조건식1이 false이면 조건식2는 실행x)
			System.out.println("소문자 이군요.");
		}
		if( !(charCode<48) && !(charCode>57) ) {
			System.out.println("0~9 숫자 이군요");
		}
//		---
		int value = 6;
		
		if( (value%2==0) | (value%3==0)){       //조건식1 과 조건식2 실행후 결과 산출(양쪽모두결과산출)
			System.out.println("2의 배수 또는 3의 배수이군요.");
		}
		if( (value%2==0) || (value%3==0)){		//쇼트써켓팅(조건식1이 false이면 조건식2는 실행x)
			System.out.println();
		}
		
	}//main
}//end class
