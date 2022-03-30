package collection.comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		
		TreeSet<Person> treeset = new TreeSet<>();
		
		treeset.add(new Person("홍길동",45));
		treeset.add(new Person("김코딩",30));
		treeset.add(new Person("김자바",20));
		
		System.out.println(treeset);
		
		
		//--traverse--
		
		Iterator<Person> iterator = treeset.iterator();
		
		while(iterator.hasNext()) {
			Person person =iterator.next();
			System.out.println(person.name+":"+person.age);
		}//while 
		
		System.out.println("----");
		
		for(Person person : treeset) {
			System.out.println(person.name+":"+person.age);
		}//enhanced for 
		
	}//main
	
}//end class
