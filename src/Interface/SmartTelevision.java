package Interface;


public class SmartTelevision 
	implements RemoteControl, Sreachable{
//interface - 다중 인터페이스
	
	private int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println(" TV를 켭니다.");
	}//turnOn
	
	public void turnOff() {
		System.out.println(" TV를 끕니다.");
	}//turuOff 
	
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
	
	//다른 인터페이스인, Sreachable에 선언된 추상메소의 재정의 
	@Override
	public void sreach(String url) {
		System.out.println(url + "을 검색합니다.");
	}//sreach
	
	
}//end class
