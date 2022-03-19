package Inheritance.Car;



public class Tire {
	
	//1.상태필드 
	public int maxRotation;				//최대 회전수(최대 수명)
	public String location;				//타이어의 위치 
	
	public int accumulatedRotation;		//누적 회전수 
	
	
	//3.생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}//constructor
	
	
	//4. 메소드 
	public boolean roll() {
		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire수명: " + (maxRotation-accumulatedRotation)+"회");
			
			return true;
		} else {
			System.out.println("***" + location + " Tire 펑크 ***");
			
			return false;
		}//if-else
	}//roll
	
	
}//end class
