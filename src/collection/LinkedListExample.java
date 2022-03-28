package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
	
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
	
		long startTime;
		long endTime;
		
//		System.currentTimeMillis(); 	//1000분의 1초 
		startTime = System.nanoTime();  //10억분의 1초 정확도로 현재시간을 반환
		
			for(int i=0; i<100000; i++) {
				list1.add(0, String.valueOf(i));	//0번인덱스 추가->계속 뒤로 밀림 
			}//for
			
		endTime = System.nanoTime();//10억분의 1초 정확도로 현재시간을 반환 
		System.out.println("ArrayList 걸린시간:" + (endTime-startTime)+"ns");
		
//		---
		startTime = System.nanoTime();
		
		for(int i=0; i<100000; i++) {
			list2.add(0, String.valueOf(i));  	    //0번인덱스 추가->계속 뒤로 밀림 
		}//for
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간:" + (endTime-startTime)+"ns");
		
	}//main
}//end class
