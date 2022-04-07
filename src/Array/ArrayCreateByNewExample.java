package Array;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		//배열의 객체생성 , 기본값, 배열인덱스의 갑 변경 
		int[] arr1 = new int[3];
//		
////		for(int i=0; i< arr1.length; i++) {
////			System.out.println("arr1[" + i + "] : " + arr1[i]);
////			
////		}//for
//		
//		//Iterable 객체만 enhanced for문에 올수있다.반복가능한 객체만 사용가능 
//		for(int number : arr1) {
//			System.out.println(number);
//		}//enhanced for
//		
////		---
//		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
////		for(int i=0; i< arr1.length; i++) {
////			System.out.println("arr1[" + i + "] : " + arr1[i]);
////		}//classical for
//
//		for(int number : arr1) {
//			System.out.println(number);
//		}//enhanced for
//		
////		---
//		
//		double[] arr2 = new double[3];
//		
////		for(int i=0; i<arr2.length; i++) {
////			System.out.println("arr2[" + i + "] : " + arr2[i]);
////		}//classical for
//		
//		for(double number : arr2) {
//			System.out.println(number);
//		}//enhanced for
////		---
//		
//		arr2[0] = 0.1;
//		arr2[1] =  .2;
//		arr2[2] = 0.3;
//		
//		for(int i=0; i<3; i++) {
//			System.out.println("arr2[" + i + "] : " + arr2[i]);
//		}//classical for
//		
//		for(double number : arr2) {
//			System.out.println(number);
//		}//enhanced for
//		
//		
////		---
//		
//		String[] arr3 = new String[3];
//		
//		for(int i=0; i<arr3.length; i++) {
//			System.out.println("arr3 [" + i + "] :" + arr3[i]);
//		}
//		
////		arr3.length = 10;			//배열의 길이는 조작할 수 없다
//		
////		---
//		
//		arr3[0] = "1월";
//		arr3[1] = "2월";
//		arr3[2] = "3월";
//		
//		for(int i=0; i<arr3.length; i++) {
//			System.out.println("arr3 [" + i + "] :" + arr3[i]);
//		}
//		
	}//main

}//end class
