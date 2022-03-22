package Interface.Casting;


public class VehicleExample {


	public static void main(String[] args) {
	
		Vehicle vehicle = new Bus();		//다형성-1
		
		vehicle.run();						//다형성-2
//		vehicle.checkFare();				//부모타입 인터페이스에 존재하지 않음
		
//		---
		
//		if(vehicle instanceof Bus) {
//			Bus bus = (Bus)Vehicle;				//강제타입변환(casting) 
//		}//instanceof
		
		
		if(vehicle instanceof Bus bus) {
			bus.run();
			bus.checkFare();
		}//instanceof 
		
	}//main
	
}//end class
