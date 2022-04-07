package ObjectClass;

public class Person {

	final String nation = "Korea";
	final String ssn;
	String name;
	
	
	public Person(final String ssn, String name) { //생성자 호출시 final 넣기 
		this.ssn = ssn;
		this.name = name;
	}//constructor 
	
	
}//end class
