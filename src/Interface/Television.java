package Interface;


public class Television implements RemoteControl{

	//1. 필드 
	private int volume;
	
	
	//2. 추상메소드의 실체메소드 
	@Override
	public void turnOn() {
		System.out.println(" TV를 켭니다.");
	}//turnOn
	
	
	@Override
	public void turnOff() {
		System.out.println(" TV를 끕니다.");
	}//turuOff 
	
	
	@Override
	public void setVolume(int volume) {
		//인터페이스에 선언된 static final 상수의 활용
		if(volume > RemoteControl.MAX_VOULUE) {
			this.volume = RemoteControl.MAX_VOULUE;
		} else if(volume < RemoteControl.MIN_VOULUE) {
			this.volume = RemoteControl.MIN_VOULUE;
		} else {
			this.volume = volume;
		}//if-else
		System.out.println("현재 TV 볼륨:" + volume);
	}//setVolume

	
	//3. default 메소드 재정의
	@Override
	public void setMute(boolean mute) {
		System.out.println("Television::setMute() invoked.");
	}//setMute
	
	
	
	
}//end class
