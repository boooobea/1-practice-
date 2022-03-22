package Interface;


public class RemoteControlExDefault {

	public static void main(String[] args) {
		
		RemoteControl rc = null;
		
		rc = new Television();	//다형성-1
		rc.turnOn();			//다형성-2
		rc.setMute(true);		//다형성-2(default method override)
		
//		---
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		
	}//main
	
}//end class
