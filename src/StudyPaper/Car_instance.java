package StudyPaper;

public class Car_instance {
//인스턴스필드-생성자-인스턴스메소드(setter, getter)
	
	//1. 인스턴스필드 
	String model;
	int speed;
	
	//2. 생성자 : 인스턴스 필드 초기화 
	Car_instance(String model){
		this.model=model;
	}//constructor
	
	
	//3. 인스턴스 메소드
	void setSpeed(int speed) {	   			// set + 필드이름 => setter(***)
		this.speed=speed;					// 현재의 필드값을 변경할 때 
	}//setSpeed
	
	int getSpeed() {						// get + 필드이름 => getter(***)
		return this.speed;					// 현재 필드의 값을 되돌려 줄 때 
	}//getSpeed
	
	void run() {
		for(int i=0; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. 시속:(" + this.speed + "km/h)");
		}//for
	}//run
	
// ------
	
	int age; 				//instance field
	
	int getAge() {			//getter for age
		return this.age;
	}//getAge
	
	void setAge(int age) {	//setter for age
		this.age = age;
	}//setAge
	
}//end class 

