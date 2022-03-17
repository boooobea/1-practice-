package StudyPaper;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//Inheritance
/* child class 
 * super() 
 * default constructor -> 컴파일러가 자동기입 
 * constructor -> super(parameter, ...) 부모클래스의 생성자 생성후 자식클래스의 생성자를 생성해야 한다.*/
@AllArgsConstructor
@NoArgsConstructor
public class DmbCellPhone extends CellPhnoe{
	
	//1. 필드
	int channel;
	
	
	//2. 생성자
	DmbCellPhone(String model, String color, int channel){
//		super();					//부모클래스의 생성자가 default constructor일때->컴파일러가 super()자동생성
									//부모클래스의 생성자(매개변수)가 있을때 ->super()직접 첫줄에 기입
		super(model,color);			//부모클래스의 생성자를 생성후 자식클래스의 생성자를 생성해야 한다. 
		
//		this.model = model;			//부모클래스의 생성자로 super()를 기입하였기 때문에 this.는 맞지 않다. 
//		this.color = color;
		this.channel = channel;
	}//constructor2
	
	
	//3. 메소드 
	void turnOn() {
		System.out.println("채널"+channel+"번 DMB 수신합니다");
	}//turnOn
	
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널"+channel+"번으로 바꿉니다.");
	}//changeChannelDmb
	
	void turnOff() {
		System.out.println("채널"+channel+"");
	}//turnOff
	
}//end class
