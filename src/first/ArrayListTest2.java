package first;

import java.util.Arrays;

public class ArrayListTest2 {				//삽입정렬(insertion sort)
	//무작위 정수를 하나씩 복원추출하여 배열생성(범위 38~200 / 크기 30)
	//배열 출력할때는 Arrays.toString()메소드 사용 
	//배열 순회(traverse)할때는 배열 인덱스 필요할때 classical for/필요없을때 enhanced for 
	//출력결과 정렬, 정렬을 위한 배열 원소간 자리바꿈의 횟수와 epoch 출력 
	//(int)(Math.raindom()*(to-from+1)) + from    
	public static void main(String[] args) {

		int to = 200;
		int from = 38;
		int[] arr = new int[30];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(to-from+1))+from;	//무작위 정수 배열[30]	
			}//for 										
			System.out.println("정렬 전 ="+Arrays.toString(arr));
					
		int epoch = 0; 	//epoch 횟수 
		int check = 0;	//자리바꿈 횟수 
				
		for(int i=1; i<arr.length; i++) {
			int a = i-1; 		// arr[0]
			int tmp = arr[i]; 	// arr[1]->tmp에 값이동 
		
			while ( (0 <= a) && ( arr[a] > tmp ))  { //arr[0] >  arr[1] 비교 
					arr[a+1] = arr[a];					//arr[0] -> arr[1]자리로이동
					a --;								
					check ++;
					}//while
					arr[a+1] = tmp;						//arr[0]자리에 원소이동 
				epoch ++; 	//에포크횟수 
				}//o-for
			System.out.println("정렬 후 = "+Arrays.toString(arr));
			System.out.println("이동횟수 = " +check);
			System.out.println("epoch = " + epoch);
		}//main
	}//end class 
//----------------------------------
				
//		int to = 200;
//		int from = 38;
//		int[] arr = new int[30];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random()*(to-from+1))+from; ////무작위 정수 배열[30]	
//		}//for 
//			System.out.println("\t" + Arrays.toString(arr));
//		int epoch = 0; 	//epoch 횟수 
//		int check = 0;	//자리바꿈 횟수 
//		
//		for(int i=1; i<arr.length; i++) {
//			for(int j=i; j>=1; j--) {
//			if(arr[j] < arr[j-1]) {
//				int a = arr[j];
//				arr[j] = arr[j-1];
//				arr[j-1] = a;		
//				check++; //자리이동시 움직임 횟수 
//				}//if
//			}//i-for
//			epoch++;	//삽입정렬 epoch횟수  
//		}//o-for
//		System.out.println("정렬 후 = " + Arrays.toString(arr));
//		System.out.println("epoch = " + epoch);
//		System.out.println("이동횟수 = " +check);
//	}//main
//}//end class  
