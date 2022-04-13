package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayTest01 {

	public static void main(String[] args) throws IOException {
		//1. 오름차순으로 정렬한 결과를 한줄에 하나씩 출력 
		// 5 5 2 3 4 1 
		
//		int[] arr = new int[] { 5, 5, 2, 3, 4, 1};
//		
//		int temp = 0;
//		for(int i=0; i<arr.length-1; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				
//			if(arr[i]>arr[j]) {
//				temp = arr[j];
//				arr[j] = arr[i];
//				arr[i] = temp;
//			}//if
//			if(arr.equals(arr[i])) {
//				arr[i] = 0;
//			}//if
//			}//inner-for
//		}//for
//
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}//for 
		
		
		
		//2. 오른차순으로 정렬한 결과를 한줄에 하나씩 출력한다. 
		// 10 5 2 3 1 4 2 3 5 1 7 
		
//		int[] arr = new int[] {10, 5, 2, 3, 1, 4, 2, 3, 5, 1, 7};
//		
//		for(int i=0; i<arr.length-1; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				
//				int temp = 0;
//				if(arr[i] > arr[j]) {
//					temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}//if
//			}//inner-for
//			
//		}//outer-for
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}//for
		
		//3. 첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째자리에서 반올림한 값을 출력 
		// 5, 1, 3, 8, -2, 2 
		
//		int[] arr = new int[] {5, 1, 3, 8, -2, 2};
//		System.out.println(Arrays.toString(arr));
//		
//		int sum = 0;
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}//for 
//		double avg = (double)sum / arr.length;
//		System.out.println((int)Math.round(avg));
		
		//4. 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬 
		//	1. 길이가 짧은 것 부터 
		//	2. 길이가 같으면 사전순으로 
		// 13, but, i , wont , hesitate, no, more, no, more, it, cannot, wait, im , your 
		
		String[] arr = new String[8];
		arr[0] = "but";
		arr[1] = " i" ;
		arr[2] = "wont";
		arr[3] = "hesitate";
		arr[4] = "no";
		arr[5] = "more";
		arr[6] = "no";
		arr[7] = "more";
			
			Arrays.sort(arr, new Comparator<String>() {

				@Override
				public int compare(String s1, String s2) {
					if(s1.length() == s2.length()) {
						return s1.compareTo(s2);
					} else {
						return s1.length()-s2.length();
					}
				}
			});
			
			System.out.println("1:"+Arrays.toString(arr));
			for(int i=1; i<arr.length; i++){
				if( ! arr[i].equals(arr[i-1])) {
					System.out.println(arr[i]);
				}//if
			}//for
	
	}//main
}//end class

