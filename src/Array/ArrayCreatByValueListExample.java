package Array;
public class ArrayCreatByValueListExample {
	public static void main(String[] args) {
//같은 타입의 데이터를 0개 이상 저장할수 있는 자료구조(Data Structure)이자, '객체'이다
//1.배열의생성
		int[] scores = {83, 90, 87};	
		
//		System.out.println("scores[3] : " + scores[3]);

//		int[] scores2;					//배열선언
//		scores = new int[]{1, 2, 3}; 	//배열의 초기화
		
//		scores2 = scores;				//비어있는 배열에 값을 넣을수 있음
		
		System.out.println("scores : " + scores); 		// 객체의 주소, [I@4517d9a3 : '['배열을 나타낸다.
		System.out.println("scores[0] : " + scores[0]);	// 배열의 첫번째 원소 출력
		System.out.println("scores[1] : " + scores[1]);	// 배열의 두번째 원소 출력
		System.out.println("scores[2] : " + scores[2]);	// 배열의 세번째 원소 출력
		
//		-------
//2. 총합과 평균 
		int sum = 0;
		for(int i=0; i<scores.length; i++) {						// 배열이 저장하고 있는 모든 데이터의 합을 구한다. 
			sum += scores[i];
		}//for
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;					// 배열 데이터의 총합과 원소의 개수로 평균을 구한다. 
		System.out.println("평균 : " + avg);
		
	}//mains
}//end class
