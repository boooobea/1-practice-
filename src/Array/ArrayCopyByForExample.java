package Array;
import java.util.Arrays;
public class ArrayCopyByForExample {
	public static void main(String[] args) {
		
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
//배열의복사 for - Arrays.toString() 
		
	//for문으로 배열을 순회하여 값을 넣는다 
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}//classical for
	//복사한 배열을 출력 
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i]+ ", ");
		}//classical for
		
//		---
		
	//Arrays.toString()으로 배열을 출력 
		System.out.println(Arrays.toString(oldIntArray));
		System.out.println(Arrays.toString(newIntArray));
		
	}//main
}//end class
