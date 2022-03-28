package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	// List : (1) 순서보장(인덱스 번호 사용하여 조작)  (2) 중복허용 
	//		  (3) 빈번한 추가, 삭제가 일어나면 적합하지 않다. 
	public static void main(String[] args) {
		
		
//		List<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<>();  //다형성-1
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");			//add(index, String) 
		list.add("iBATIS");
		
//		--
		int size = list.size();				//size: 요소의 수 
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
//		--
		String skill = list.get(2);			//get : 특성 요소 값을 얻어냄 
		System.out.println("2 : " + skill);
		System.out.println();
		
//		--
		for(int i=0; i<list.size(); i++) {	
			String str = list.get(i);
			
			System.out.println(i + " : " + str);
		}//classical for 
		System.out.println();
//		--
		
		list.remove(2);						//remove : 요소 삭제 
		list.remove(2);
		list.remove("iBATIS");				//요소객체를 지정하여 삭제가능
		
//		--
		/* index 번호가 필요없이 순회할 때는 enhanced for문 사용 
		 * Iterable 인터페이스의 구현객체면 사용 가능 하다. */
		for(String str : list) {			
			System.out.println(">> : " + str);
		}//enhanced for 
		System.out.println();
		
		
	}//main
	
}//end class
