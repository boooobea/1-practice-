package Inheritance;


public class abs_Dog extends abs_Animal{

	
	public abs_Dog() {
		this.kind = "포유류";
	}//constructor
	
	
	//abstract method override
	@Override
	public void sound() {
		System.out.println("멍멍");
	}//sound
	
}//end class
