package IO.System;

import java.io.InputStream;

public class SystemExample {

	public static void main(String[] args) throws Exception {
		
		System.out.println("== 메뉴 ==");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 종료 하기");
		
		System.out.println("메뉴를 선택하세요.");
		
		InputStream is = System.in;
		char inputChar = (char)is.read();
		//Blocking : 입력받지 않고 대기중인 상태
	
		switch(inputChar) {
			case '1' :
				System.out.println("예금 조회를 선택하셨습니다.");
				break;
			case '2' : 
				System.out.println("예금 출금을 선택하셨습니다.");
				break;
			case '3' : 
				System.out.println("예금 입금을 선택하셨습니다.");
				break;
			case '4' :
				System.out.println("종료 하기를 선택하셨습니다.");
		}//switch
		
	}//main
}//end class
