package first;

import java.util.Arrays;

public class Practice04 {

	public static void main(String[] args) {
		
/*	 	//1. 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력하세요.
		//거스름돈 2860원->500원2개 / 100원3개 / 50원 1개 / 10원 1개 
		
		int money = (int)(Math.random() *500)* 10;
		
		int[] coin = {500, 100, 50, 10};
	
		System.out.println("거스름돈-> "+money+"원");
		
		for(int i=0; i<coin.length; i++) {
			
			System.out.println(coin[i]+ "원" +money/coin[i]+ "개");
			
			money = money%coin[i];
			
		}//for
*/
		//2. 1~5사이의 랜덤한 값이 10개 저장된 배열을 만들고
		//중복된 값이 제거된 배열을 만드세요.

		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			int num = (int)(Math.random()*5)+1;
			arr[i] = num;
		}//for
		System.out.println(Arrays.toString(arr));
		
		for()
		
		
	}//main
}//end class
