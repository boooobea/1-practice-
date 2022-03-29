package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("iBATIS");
		System.out.println("set : " + set );
		// [ ] 대괄호 - 객체 표기 
		
//		---
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
//		--
		//Iterator 외부반복자 : while 와 같이 사용(hasNext - next)
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			
			System.out.println("\t"+element);
			
			//Iterator.remove() : 순회하는중에 요소를 삭제할 수 있다.
			iterator.remove();
			
		}//while 
		
	
	}//main
	
}//end class
