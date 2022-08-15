package first;

import java.util.Scanner;

public class IceCream_mini {
/* 1. 메뉴를 변경하는 기능
 * 2. 메뉴의 가격 변경 기능
 * 3. 메뉴의 재고 추가 기능
 * 4. 메뉴 추가 기능 
 * 5. 총 수익 확인 
 * */
	 
	static String[] ministore = {"딸기","초코","바닐라","피스타치오","요거트","모카"} ;	//미니상점
	static int[] prices = { 3000, 3000, 3000, 4500, 4000, 3500 };//가격
	static int[] stock = { 5, 5, 5, 5, 5, 1};				//재고

	static int admin = 1001;		//관리자비밀번호
	static int totalIncome = 0;		//총 수익
	
	static Scanner scanner = new Scanner(System.in);
	
	static void menuList() {
	
		for(int i=0; i<ministore.length; i++) {
			System.out.printf("[ [%s] %s : %d원 ]\n", i, ministore[i], prices[i]);
		};
	
		
	}//menuList
	
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
		System.out.println("[ 실행하실 번호를 입력하세요. ] ");
		int num = scanner.nextInt();
		
		switch (num) {
		 case 1 -> { changeIcecream(); }
//		 case 2 -> { changePrices(); }
//		 case 3 -> { plusItem(); }
//		 case 4 -> { plusIcecream(); }
		 case 5 -> System.out.println("[ 현재까지의 총 수익 :"+totalIncome+" 원 ]");
		
		}//switch
	}//adminpage
	
	static void changeIcecream() {
		menuList();
		System.out.println("[ 변경할 메뉴의 번호를 선택 (0 ~ " +ministore.length+ ") 하세요.] "); 
		int i = scanner.nextInt();
		System.out.println(ministore[i-1]+"를(을) 무엇으로 변경하시겠습니까? ");
		scanner.nextLine();
		String name = scanner.next();
				
		System.out.println(name +" 의 가격은 얼마입니까? ");
		int v = scanner.nextInt();
		System.out.println(name +" 의 재고는 몇개를 넣으시겠습니까? ");
		int z = scanner.nextInt();
		
		ministore[i-1] = name;
		prices[i-1] = v;
		stock[i-1] = z;	
		System.out.println("[ 메뉴변경이 완료 되었습니다. ]");
		Itemlist();
	}//changeIcecream

	static void Itemlist() {
		System.out.println("[ 판매중인 아이스크림 ]");
		for(String item : ministore) {
			System.out.println(item);
		}//enhanced for
		return;
	}//Itemlist
	
}//end class
