package Inheritance.abstract1;


/* abstract class*/
public abstract class Phone {

	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}//constructor
	
	public void turnOn(){
		System.out.println("폰 전원을 켭니다.");
	}//turnOn
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}//turnOff
	
}//end class
