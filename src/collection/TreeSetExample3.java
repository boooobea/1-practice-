package collection;

import java.util.NavigableSet;
import java.util.TreeSet;

//TreeSet - 범위검색   
public class TreeSetExample3 {

	public static void main(String[] args) {

		TreeSet<String> treeset = new TreeSet<>();
		
		treeset.add("apple");
		treeset.add("forever");
		treeset.add("description");
		treeset.add("ever");
		treeset.add("zoo");
		treeset.add("base");
		treeset.add("guest");
		treeset.add("cherry");
		
		System.out.println(treeset);
		
//		---
		
		//범위검색 
		System.out.println("[c~f사이의 단어 검색]");
		
		NavigableSet<String> rangset = treeset.subSet("cherry",true, "forever", true);
		// subSet() : 완전한 문자열을 지정하여 선택 true / false(선택유무) 
		// headSet() , tailSet() 
		
		for(String word : rangset) {
			System.out.println(word);
		}//enhanced for 
		
	}//main
	
}//end class
