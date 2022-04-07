package Array;
public class ArrayInArrayExample {
	public static void main(String[] args) {
		
//		int[][] mathScores = new int[2][3];
		
//		for(int i=0; i<mathScores.length; i++) {
//			
//			for(int k=0; k<mathScores[i].length; k++) {
//				
//				System.out.println("mathScores["+i+"]["+k+"]="+ mathScores[i][k]);
//			}//i-for
//		}//o-for
		
//		---
		int[][] mathScores = { {1, 2} , {3, 4}, {5, 6, 7}, };
		//[] 빈배열을 넣어도 된다. 타입이 배열 타입이기 때문에 배열아닌 정수는 불가 
			for(int[] num :mathScores) {
				for(int number : num) {
					
					System.out.println(number);
				}//i-for
			}//o-for
		
			System.out.println(mathScores.length);
			System.out.println(mathScores[0].length);
			System.out.println(mathScores[1].length);
			System.out.println(mathScores[2].length);
			
	}//main
}//end class
