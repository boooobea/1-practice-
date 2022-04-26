package first;

import java.util.Arrays;

public class LottoNumber {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*45)+1;
			
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					arr[i] =(int)(Math.random()+45)+1;
				} else {
					break;
					
					
				}//if-else
			}//inner-for
		
		}//outer-for
		
		Arrays.sort(arr);
		
		for(int printarr : arr) {
			System.out.println(printarr);
		}//enhanced for
		
	}//main
}//end class
