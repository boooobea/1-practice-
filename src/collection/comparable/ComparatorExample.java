package collection.comparable;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		
		Comparator<? super Fruit> comparator = new DescendingComparator();
		
		TreeSet<Fruit> treeset = new TreeSet<>(comparator);
		
		treeset.add(new Fruit("포도", 3000));
		treeset.add(new Fruit("수박", 10000));
		treeset.add(new Fruit("딸기", 6000));
		
		System.out.println(treeset);
		
		//--traverse-- 
		
		Iterator<Fruit> iterator = treeset.iterator();
		
		while(iterator.hasNext()){
			Fruit fruit = iterator.next();
			System.out.println(fruit.name+"="+fruit.price);
		}
		
	}//main
	
}//end class
