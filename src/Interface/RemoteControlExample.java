package Interface;


public class RemoteControlExample {
	
	public static void main(String[] args) {

	RemoteControl rc ; 				//부모객체 선언
	
	rc = new Television();			//다형성-1
	System.out.println("rc1:" + rc);
	
	rc.turnOn();					//다형성-2
	rc.turnOff();
	
	rc = new Audio();				//다형성-1
	System.out.println("rc2: " + rc);
	
	rc.turnOn();					//다형성-2
	rc.turnOff();
	
	}//main
}//end class
