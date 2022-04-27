package first;

import java.util.Scanner;

public class IceCream_mini {
/* 1. 메뉴를 변경하는 기능
 * 2. 메뉴의 가격 변경 기능
 * 3. 메뉴의 재고 추가 기능
 * 4. 메뉴 추가 기능 
 * 5. 총 수익 확인 
 * */
	public static final int MAX = 6;
	
	static String[] ministore = new String[MAX];
	static int[] prices = new int[MAX];
	
	static int count = 4; 
	static int admin = 1001;
	static int totalIncome = 0;
	static Scanner scanner = new Scanner(System.in);
	
	public static void admin() {
		
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("[ 관리자 페이지 : 비밀번호를 입력하세요. ] ");
			System.out.println("[ -- 종료하기: 1번 ] ");
			System.out.println("------------------------------------------");
			int password = scanner.nextInt();
			
			if(admin == password) {
				adminpage();
				break;
			} else if(1 == password){
				System.out.println("[ 관리자 페이지가 종료됩니다. ]");
				break;
			} else {
				System.out.println("[ 비밀번호가 틀립니다. ]");
			}//if-else
		}//while 
	}//admin
	
	static void adminpage() {
		System.out.println("[ 관리자페이지 : 접속되었습니다. ]");
		System.out.println("[1. 메뉴변경 2. 가격변경 3. 재고추가 4. 메뉴추가 5.수익확인(종료)");
		System.out.println("[ 번호를 입력하세요.] ");
		int num = scanner.nextInt();
		
		switch (num) {
		 case 1 -> {
			System.out.println("[ 변경할 메뉴의 번호를 입력하세요. "); 
		 }
		
		
		}//switch
	}//adminpage
	

}//end class
