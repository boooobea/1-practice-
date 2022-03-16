package first;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
/*
//1. 정수 한개를 입력 받아서, 그 수가 50이상의 수인지 50 미만의 수인지 판단해보자.

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요 > ");
		
		int num = scanner.nextInt();
		
		if(num>=50) {
			System.out.println("입력하신 숫자는 '"+num+"'으로 50이상의 정수입니다.");
		} else {
			System.out.println("입력하신 숫자는 '"+num+"'으로 50이하의 정수입니다.");
		}//if 
	
		
//2. 정수 한개를 입력 받아서, 그 수가 3의 배수인지 판단해보자
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요> ");
		int num = scanner.nextInt();
		
		if(num%3==0) {
			System.out.println("입력하신 숫자는 3의배수 입니다> "+num);
		} else {
			System.out.println("입력하신 숫자는 3의배수가 아닙니다.> "+num);
		}

		
		
//3. 코리아 초등학교에서 1학년부터 4학년까지 중간고사 시험을 보았다.
//4학년은 70점 이상이면 합격, 그 이외의 학년는 60점 이상이면 합격
//점수가 0미만 100초과면 경고문구 출력 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("학년과 점수를 입력하세요 > ex) 1(학년), 100(점) ");
		int student = scanner.nextInt();
		int score = scanner.nextInt();
		
		if(0<=score && score<=100) {	// 허용되는 점수0~100 
		
			if(student!=4) {
				if(score>=60) {
					System.out.println("합격");
				} else {
					System.out.println("불합격");
				}
			if(student==4)
				if(score>=70) {
					System.out.println("합격");
				} else {
					System.out.println("불합격");
				}
				
			}//if
		} else {
		System.out.println("!!! 점수를 다시 입력하세요 !!!");
		}//if

//4. 키를 입력받은후 110cm 이상일시 놀이기구 탑승이 가능하다. 
// 키가 110cm미만일시 보호자가 옆에 있는지 체크 
// 있으면 탑승가능, 없으면 다음에 보호자랑 같이 오세요 문구 출력 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요 > ");
		int cm =scanner.nextInt();
		int parent;
		
		if(cm>=110) {
			System.out.println("탑승가능");
		} else {
		
			System.out.println("보호자와 함께 있습니까? > yse(1) or no(2)");
			parent = scanner.nextInt();
			
			if(parent==1) {
				System.out.println("탑승가능(보호자동반)");
			} else if(parent==2){
				System.out.println("다음에 보호자랑 같이 오세요.");
			}
		}//if
*/
	
//5. 두 정수 A, B를 입력받고 비교하는 프로그램
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요.");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a > b) {
			System.out.println(">");
		} else if(a < b) {
			System.out.println("<");
		} else if(a==b) {
			System.out.println("==");
		}
		
	}//main
}//end class
