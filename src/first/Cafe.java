package first;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Cafe {
	Map<String, Integer> orders = new HashMap<>();
	
	Scanner scanner = new Scanner(System.in);
	String coffeeName = null;
	int price = 0;
	int TotalPrice = 0;
	int GuestMoney = 0;
	
	public Cafe() {
	 ;;
	}//default-constructor
	
	public Cafe(String coffeeName, int price, int TotalPrice){
		this.coffeeName = coffeeName;
		this.price = price;
		this.TotalPrice = TotalPrice;
	}//constructor
	
	public void cafeMenu() {
		System.out.println("==== Cafe Menu Order ===");
		System.out.println("1. 아메리카노 : 3,500원");
		System.out.println("2. 카푸치노   : 4,000원");
		System.out.println("3. 녹차라떼   : 5,500원");
		System.out.println("4. 우유       : 3,000원");
		System.out.println("5. 생과일 주스: 5,000원");
		System.out.println("=======================");
		System.out.println("[주문하실 음료를 선택하세요. >>]");
		
	}//cafeMenu
	
	public void orderCoffee() {
		int order = scanner.nextInt();
		switch(order) {
			case 1 ->{ 
					this.coffeeName = "아메리카노";
					this.price = 3500;
					this.TotalPrice += price;
					break;}
			case 2 ->{
					this.coffeeName = "카푸치노";
					this.price = 4000;
					this.TotalPrice += price;
					break;}
			case 3 ->{
					this.coffeeName = "녹차라떼";
					this.price = 5500;
					this.TotalPrice += price;
					break;}
			case 4 ->{ 
					this.coffeeName ="우유";
					this.price = 3000;
					this.TotalPrice += price;
					break;}
			case 5 ->{
					this.coffeeName ="생과일주스";
					this.price = 5000;
					this.TotalPrice += price;
					break;}
			default -> {System.out.println("[잘못 누르셨습니다. 다시 확인하세요]");}
		}//switch
		orders.put(this.coffeeName, this.price);
		Cafe.this.choice();
		Cafe.this.plusOrder();
	}//orderCoffee
	
	void choice() {
		Set<Map.Entry<String, Integer>> choiceMenu = orders.entrySet();
		Iterator<Map.Entry<String, Integer>> enteyIterator = choiceMenu.iterator();
		
		while(enteyIterator.hasNext()) {
			Map.Entry<String, Integer> entey = enteyIterator.next();
			String choice = entey.getKey();
			Integer value = entey.getValue();
			System.out.println("[선택한 메뉴]"+choice+":" +value +"원");
		}//while 
		System.out.println("\n[총 주문금액 :" + this.TotalPrice + "원]");
		System.out.println("[현재 잔액: "+this.GuestMoney + "원]");
	}//choice
	
	void plusOrder() {
		System.out.println("[주문을 추가하시겠습니까?(예:1 / 아니오:2)]");
		int plusOrder= scanner.nextInt();
		if(plusOrder==1) {
			Cafe.this.cafeMenu();
			Cafe.this.orderCoffee();
		} else {
			System.out.println("[결제를 진행합니다.]");
			Cafe.this.payment(this.GuestMoney);
		}
	}//plusOrder
	
	int payment(int money) {
		if(money<this.TotalPrice) {
			System.out.println("[잔액이 부족합니다.(결제취소)]");
			return money;
		} else {
			System.out.println("[결제가 완료되었습니다. 맛있게 드세요!]");
			int change = money-this.TotalPrice;
			System.out.println("\n[잔액 :" + change + "]");
			return change;
		}//if-else
	}//payment
	
	
}//end class
