package ObjectClass;

public class Korean{
	//필드 
	String nation = "대한민국";
	String name; 
	String ssn; 
	
//	public Korean(String n, String s) {
//		name = n;
//		ssn = s;
//	}//constructor_이름으로 표기
//	   실제이름과 동일하게 만들고 this를 쓴다. 
	
	
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		System.out.println("this : " +this);	
	}//construction
		
}//end class
