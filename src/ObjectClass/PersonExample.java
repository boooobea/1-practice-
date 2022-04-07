package ObjectClass;

public class PersonExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456-1234567", "김뫄뫄");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		p1.nation = "usa";
		p1.ssn = "00000-0000000";
		p1.name = "을지문덕";
		
//		----
		
		Person p2 = new Person("000111-1111111", "김피피");
		
	}//main
	
}//end class
