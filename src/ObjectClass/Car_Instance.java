package ObjectClass;

public class Car_Instance {
//인스턴스필드-생성자-인스턴스메소드(setter, getter)
	
	//1.인스턴스필드
	String model;
	int speed;
	
	//2.생성자
	Car_Instance(String model){
		this.model = model;
	}//constructor
											
	//3.인스턴스 메소드 
	void setSpeed(int speed) { 				//메소드 이름 ='set'+필드이름=>setter (***)
		this.speed = speed;					//매개변수가 필드 이름과 같아서 필드의 값을 변경할때, 정적필드x
	}//setSpeed								//인스턴스 필드마다 하나씩 생성 
	
	
	//3-1 인스턴스 메소드					//필드의 값을 되돌려주는 목적
	int getSpeed(int speet) {				//메소드 이름 ='get'+필드이름=>getter (***), 정적필드x
		return this.speed;
	}//getSpeed
	
	//4.인스턴스 메소드 
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}//for
	}//run
//	---------------------
	
	int age; // instance field
	
	int getAge() {			//getter for age
		return this.age;
	}//getAge
	
	void setAge(int age) {	//setter for age
		this.age = age;
	}//setAge
}//end class
