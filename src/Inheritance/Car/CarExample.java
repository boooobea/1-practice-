package Inheritance.Car;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run(); //다형성 - 2(오버라이드 호출)
			
			switch(problemLocation) {
			
				case 1://다형성 -1(프로모션) 
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.frontLeftTire = new HankookTire("앞왼쪽", 15);
					
					break;
				case 2://다형성 -1
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽", 13);
					
					break;
				case 3://다형성 -1
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.backLeftTire = new HankookTire("뒤왼쪽", 14);
					
					break;
				case 4://다형성 -1
					System.out.println("뒤오른쪽 KumhoTire로 교체");
					car.backRightTire = new KumhoTire("뒤오른쪽", 17);
			
			}//switch
			System.out.println("---------------------------------------");

		}//for
	}//main
	
}//end class
