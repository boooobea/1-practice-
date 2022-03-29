package collection;

import java.util.HashMap;
import java.util.Map;

//HashMap 
public class HashMapExample2 {

	public static void main(String[] args) {
		
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1,"김코딩"), 95);
		map.put(new Student(1,"김코딩"), 95);
		
		System.out.println("총 Entry 수: " + map.size());
		
		System.out.println("map: "+ map);
		// { }중괄호 key = value 표기
		
	}//main
	
}//end clss
