package collection;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		
		List<String> list1 = 
				Arrays.asList("홍길동", "김자바", "김코딩"); //다형성-1
		
		System.out.println("list1 : " + list1);
		
		
		for(String name : list1) {
			System.out.println(name);
		}//enhanced for 
		
//		--
		Integer integer = 1;
		int i = integer;
		
//		--
		List<Integer> list2 = Arrays.asList(1, 2, 3);		//다형성-1 , Auto-boxing 
	
		System.out.println("list2 :"+list2);
		
		for(int value : list2) {
			System.out.println(value);
		}//enhanced for
		
		
	}//main
	
}//end class
