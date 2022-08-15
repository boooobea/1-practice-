package first;

import java.util.Scanner;

public class CafeOrder {

	public static void main(String[] args) {
	Cafe cafe = new Cafe();
	System.out.println("현재 잔액을 확인하세요 >>");	
	Scanner scanner = new Scanner(System.in);
	cafe.GuestMoney = scanner.nextInt();
	 
	System.out.println("[현재 잔액" + ":" + cafe.GuestMoney + "]");
	System.out.println("카페에 들어왔습니다. 주문을 합시다.\n");
	
	cafe.cafeMenu();
	cafe.orderCoffee();
	
	
			
		
	
	}//main
	
}//end class
