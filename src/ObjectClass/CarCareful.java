package ObjectClass;

public class CarCareful {
// 객체생성 -> 인스턴스 멤버 사용 
	
	int speed;		// instance field 
	
	void run() {	// instance method 
		System.out.println(speed + "으로 달립니다.");
	}//run

	
	
	
	public static void main(String[] args) {

		CarCareful myCar = new CarCareful();
		
		myCar.speed = 60;
		myCar.run();
		
	}//main
}//end class
