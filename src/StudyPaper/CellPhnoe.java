package StudyPaper;


//Inheritance 
/* parent class */
public class CellPhnoe {
	//필드
	String model;
	String color;
	
	//생성자
	public CellPhnoe() {
		;;
	}//
	
	public CellPhnoe(String model) {
		this.model=model;
	}//constructor1
	
	public CellPhnoe(String model, String color) {
		this.model=model;
		this.color=color;
	}//constructor1
	
	
	//3.메소드 
	void powerOn() {System.out.println("전원을 켭니다");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	
	void bell() {System.out.println("전화벨이 울립니다");}
	
	void sendVoice(String message) {System.out.println("나 :"+ message );}
	void receiveVoice(String message) {System.out.println("상대방: "+ message);}
	
	void hangUp() {System.out.println("");}
	
}//end class
