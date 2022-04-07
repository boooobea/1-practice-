package Array;

public class ArrayCreateByValueListExample {
	
	public static void main(String[] args) {
		//배열참조변수의 선언과 초기화의 분리 
		int[] scores;
		scores = new int[] {83, 90, 97};	//직접 new 연산자로 생성해야한다.
		
//		----
		
		int sum1 = 0;
		for(int i=0; i<scores.length; i++) {
			sum1 += scores[i];
		}//for
		
//		----
		System.out.println("총합 : " + sum1);
		
		int sum2 = add( new int[] {83, 90, 87} );	
//		int sum2 = add( {83, 90, 87} );			//{}만으로는 안된다.
		
		System.out.println("총합 : " + sum2);
		System.out.println();
		
	}//main
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}//for
		return sum;
	}//add
		
}//end class
