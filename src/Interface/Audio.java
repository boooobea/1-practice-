package Interface;
import lombok.ToString;


@ToString
public class Audio implements RemoteControl {
		// Audioimpl         IRemoteControl

	//1. 필드 
	private int volume;
	
	
	//2. 추상메소드의 실체메소드 
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}//turnOn
	
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
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
		System.out.println("현재 Audio 볼륨:" + volume);
	}

	
	//3. default method
	//override할때는 default 키워드를 삭제한다. 
	@Override
	public void setMute(boolean mute) {
		System.out.println("Audio::setMute() invoked.");
	}//setVolume
	
	
	//static method override
	/*The method changeBattery() of type Audio must override or implement a supertype method
	 * 인터페이스를 구현하여도 모든 정적멤버는 소속이 clazz 이기때문에(공통) 오버라이드 할 수 없다. 
	 */
//	@Override
//	static void changeBattery(){
//		System.out.println("Audio::changeBattery() invoked.");
//	}//changeBattery
	
	
	
}//end class
