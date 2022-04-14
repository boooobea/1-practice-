package first;


public class Cafe {
	
	String coffeeName = null;
	int price = 0;
	int TotalPrice = 0;
	
	public Cafe() {
	 ;;
	}//default-constructor
	
	public Cafe(String coffeeName, int price, int TotalPrice){
		this.coffeeName = coffeeName;
		this.price = price;
		this.TotalPrice = TotalPrice;
	}//constructor
	
	void orderCoffee(int order) {
	switch(order) {
		case 1 : 
				this.coffeeName = "아메리카노";
				this.price = 3500;
				this.TotalPrice += price;
				break;
		case 2 :
				this.coffeeName = "카푸치노";
				this.price = 4000;
				this.TotalPrice += price;
				break;
		case 3 :
				this.coffeeName = "녹차라떼";
				this.price = 5500;
				this.TotalPrice += price;
				break;
		case 4 : 
				this.coffeeName ="우유";
				this.price = 3000;
				this.TotalPrice += price;
				break;
		case 5 : 
				this.coffeeName ="생과일주스";
				this.price = 5000;
				this.TotalPrice += price;
				break;
			}//switch
		}//orderCoffee
		
	void cafeMenu() {
		System.out.println("*** Cafe Menu Order ***");
		System.out.println("1. 아메리카노 : 3,500원");
		System.out.println("2. 카푸치노   : 4,000원");
		System.out.println("3. 녹차라떼   : 5,500원");
		System.out.println("4. 우유       : 3,000원");
		System.out.println("5. 생과일 주스 : 5,000원");
		System.out.println("-----------------------");
		}//cafeMenu
}
