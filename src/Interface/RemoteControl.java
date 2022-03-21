package Interface;


//Interface - public / default 
public interface RemoteControl {
	
	 //인터페이스, 추상클래스는 다형성의 부모타입이기 때문에 public이다. 
	
	 //1. static final 상수 선언 
	//인터페이스에 선언할 수 있는 첫번재 멤버
	 public static final int MAX_VOULUE = 50;
	 public static final int MIN_VOULUE = 0;
	
	 
	 //2. 추상메소드(강제 규격)
	 //자식객체가 반드시 구현해야 할 기능을 선언 
	 public void turnOn();
	 public void turnOff();
	 public void setVolume(int Volume);
	 
	 
	 /*------JAVA 8 
	  * 인터페이스 기능을 추가하게 되면 인터페이스를 구현하는 모든곳에 
	  * 공통으로 적용할 수 없기 때문에 추가되었다. */
	 
	 
	 //3. 디폴드메소드 
	 // 객체생성없이 사용이 불가한 인스턴스 메소드,  자식객체에서 객체를 생성하여 사용 할 수 있다. 
	 default void setMute(boolean mute) {
		 if(mute) {
			 System.out.println("무음 처리합니다.");
		 } else {
			 System.out.println("무음 해제합니다.");
		 }//if-else
	 }//setMute
	 
	 
	 //4. 정적메소드
	 //공통적인 기능적인 측면을 추가
	 static void changeBettery() {
		 System.out.println("건전지를 교환합니다.");
	 }//changeBettery
	 
	 
}//end class
