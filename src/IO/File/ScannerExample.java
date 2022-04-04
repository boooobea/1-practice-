package IO.File;

import java.util.Scanner;

import lombok.Cleanup;

public class ScannerExample {

	public static void main(String[] args) {
		
		@Cleanup("close") //("메소드명") : 호출하여 닫음 
		Scanner scanner = new Scanner(System.in);		//Scanner 객체 신청
		
		System.out.print("문자열 입력> ");				//prompt 메세지 출력
		String inputString = scanner.nextLine();		//문자열로 입력받음 
		System.out.println(inputString);
		System.out.println();
		
		System.out.print("정수 입력> ");
		int inputInt = scanner.nextInt();
		System.out.println(inputInt);
		System.out.println();
		
		System.out.print("실수 입력> ");
		double inputDouble = scanner.nextDouble();
		System.out.println(inputDouble);
		
		scanner.reset(); //reset() : 반복적으로 사용하여 읽을 때 초기화 상태로 돌아가야
						 // 오류가 적다. 
		
//		scanner.close();
	}//main
}//end class
