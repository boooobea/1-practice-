package collection;

import java.util.TreeSet;


//TreeSet - 이진트리를 통해, 요소를 미리 정렬시키고 
// 정렬된 데이터를 이용해서, 빠른 검색을 해줄 수 있다. 
public class TreeSetExample {

	public static void main(String[] arg) {
		
		TreeSet<Integer> scores = new TreeSet<>();
		
		//int -> Integer : Auto-Boxing
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		System.out.println(scores);	 //자동으로 정렬하여 출력 
		
//		--- 
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수: " + score + "\n");
		
		score = scores.lower(95);
		System.out.println("95점 아래 점수: " + score);
		
		score = scores.higher(95);
		System.out.println("95점 위의 점수: " + score + "\n");
		
		score = scores.floor(95);
		System.out.println("95점 이거나 바로 아래 점수:" + score);
		
		score = scores.ceiling(95);
		System.out.println("95점 이거나 바로 위의 점수:" + score + "\n");
		
//		---
		
		while(!scores.isEmpty()) {
			
			score = scores.pollFirst();	
			
			//pollFirst() : 작은값을 하나씩 빼낸다. 
			
			System.out.println(score + "(남은 객체 수:" + scores.size() + ")");
		}//while 
		
	
	}//main
	
}//end class
