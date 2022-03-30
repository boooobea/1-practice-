package collection.StackQueue;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Coin> coinbox = new Stack<>();
		
		coinbox.add(new Coin(50));
		coinbox.add(new Coin(100));
		coinbox.add(new Coin(500));
		coinbox.add(new Coin(10));
		
		System.out.println(coinbox);
		
		//--Traverse-- 
		
		while(!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();
			System.out.println("꺼낸 동전:"+coin.getValue()+"원");
		}//while
		
		
		
	}//main
	
}//end class
