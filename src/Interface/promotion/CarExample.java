package Interface.promotion;


public class CarExample {

	public static void main(String[] args) {
		
		
		Car mycar = new Car();			
		
		mycar.run();
		
//		--
		
		mycar.frontLeftTire = new KumhoTire();
		mycar.fronRightTire = new KumhoTire();
		
//		--
		mycar.run();
		
		
		
	}//main
}//end class
