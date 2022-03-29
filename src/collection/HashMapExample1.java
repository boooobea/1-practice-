package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


//HashMap - Iterator, enhanced for 
public class HashMapExample1 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("김자바", 85);
		map.put("김코딩", 90);
		map.put("김땡땡", 80);
		map.put("김코딩", 50);
		System.out.println("총 Entry 수 :" + map.size());
		
//		---
		
		System.out.println("\t김코딩: " + map.get("김코딩"));
		System.out.println();
		
//		---
		
		//객체를 하나씩 순회하며 처리 
		//Iterator - while - hasenext - next
		Set<String> keyset = map.keySet();
		
		//Map - key 를 순회 
		Iterator<String> keyiterator = keyset.iterator();
		
		while(keyiterator.hasNext()) {
			String key = keyiterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+ key +":"+ value);

//			keyiterator.remove(); // 순회하는중에 요소를 삭제할 수 있다.
			
		}//while 

//		---
		
		//enhanced for  <->  Iterator-while 
		for(String key : keyset) {
			Integer value = map.get(key);
			System.out.println(key+":"+value);
		}//enhanced for
//		---

		
		map.remove("김코딩");
		System.out.println("총 Entry 수:" + map.size());
		
//		---
		
		// Map - Entry를 순회 
		Set<Map.Entry<String, Integer>> entryset = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> entryiterator = entryset.iterator();
		
		while(entryiterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryiterator.next();
			
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}//while
		
//		---
		
		map.clear(); //전체삭제 
		map.isEmpty(); //요소가 비어있는지 확인 
		
		System.out.println("총 Entry 수: " + map.size());
		
		
		
		
	}//main
	
}//end class
