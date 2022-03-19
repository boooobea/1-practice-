package Inheritance.Car;

public class KumhoTire extends Tire{

	//1.필드 
		
	
	//2.생성자 
	public KumhoTire(String location, int maxRotaton) {
		super(location, maxRotaton);
	}//constructor
	
	
	//3. 메소드
	public boolean roll() {
		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire수명: " + (maxRotation-accumulatedRotation)+"회");
			
			return true;
		} else {
			System.out.println("***" + location + " KumhoTire 펑크 ***");
			
			return false;
		}//if-else
	}//roll
}//end class
