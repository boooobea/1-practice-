package collection;

import java.util.NavigableSet;
import java.util.TreeSet;

//TreeSet - 오름차순, 내림차순 
public class TreeSetExample2 {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		System.out.println(scores);
		
//		---
		
		NavigableSet<Integer> descendingset = scores.descendingSet();
		//descendingSet() : 내림차순 
		
		for(Integer score : descendingset) {
			System.out.print(score + " ");
		}//enhanced for 
		System.out.println();
		
		
		NavigableSet<Integer> ascendindSet = descendingset.descendingSet();
		//descendingSet x 2 : 한번 더 호출시 오름차순 
		
		for(Integer score : ascendindSet) {
			System.out.print(score + " " );
		}//enhanced for 
		
	}//main
	
}//end class
