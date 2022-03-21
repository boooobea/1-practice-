package Interface;


//익명 구현 객체
public class RemoteControlExample_1 {

	public static void  main(String[] args) {

		
		RemoteControl rc = new RemoteControl() {
			
		private String name = "bibian";	       //추가한 필드 
				int age = 23;
			
		public void instancemethod() {		   //추가한 메소드 
			;; 
		}//instancemethod
		
			
		@Override
		public void turnOn() {
			System.out.println("turnOn()::invoked. name:"+this.name);
		}//turuOn
		
		@Override
		public void turnOff() {
			System.out.println("turnOff()::invoked. age:"+this.age);
			
			System.out.println("\t+this" + this);
		}//turnOff
		
		@Override
		public void setVolume(int Volume) {
			System.out.println("setVolume()::invoked.");
		}//setVolume
		
		};//익명구현객체 생성 
		
		//객체 생성 후 사용가능
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(RemoteControl.MAX_VOULUE);
		System.out.println(rc);
		
//		---
		
	//익명구현객체 블록내부에 선언된 필드, 메소드는 블록외부에서 사용불가
	//인터페이스의 객체 생성인데 인터페이스 원래 멤버가 아니기 때문이다. 
//		rc.name;			
//		rc.age;
//		rc.instancemethod()
		
	}//main
	
}//end class
