package first;
import java.util.Arrays;

	public class ArrayListTest {
//		1~100까지의 무작위 정수를 배열에 넣었을때 
//	 	오름차순으로 정렬하였을때 
// 		정렬이 끝나는 시점은 언제인가 , 무엇으로 판단할 것인가 
		
		
		public static void main(String[] args) {
			int[] arr = new int[20];
			for(int i=0; i<arr.length;i++) {
			arr[i] =(int)((Math.random()*100)+1);	
			}//for - 배열에 무작위 정수의 요소 넣기 
			
			System.out.println("정렬 전" + Arrays.toString(arr));
			
			int epoch = 0;
			for(int i=0; i<arr.length; i++) {
				int check = 0; 
				for(int j=0; j<arr.length-i-1; j++) { 
//		마지막 인덱스는 제외(마지막숫자는 비교대상없음), 배열길이 -1
					
					if(arr[j] > arr[j+1]) {
						int a = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = a;
						check ++; // 움직인횟수 
					}//if
				}//i-for
				if(check!=0) { 	//움직인횟수가 1번이라도 있으면 
					epoch ++; 	//에포크횟수 
					} else {    //움직인횟수가 0번이면 
					break;
				}
			}//o-for
			System.out.println("정렬 후" + Arrays.toString(arr));
			System.out.println(" - 총 epoch : "+epoch); //총 에포크 수 
		}//main
	}//end class 
