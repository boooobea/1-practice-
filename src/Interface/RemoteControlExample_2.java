package Interface;


public class RemoteControlExample_2 {

	public static void main(String[] args) {
		
		//구현객체 생성
		SmartTelevision tv = new SmartTelevision();
		
		
		//다형성-1
		RemoteControl rc = tv;
		Sreachable sreachable = tv;
		
		//다형성-2
		rc.turnOn();
		sreachable.sreach("http://www");
		
		//디폴트 메소드 호출 
		rc.setMute(false); 
		
		RemoteControl rc2 = null; //객체 없이는 디폴트 메소드는 사용할 수 없다. 
		rc2.setMute(false);
		
		Sreachable rc3 = new Sreachable() {		//다형성-1
			@Override
			public void sreach(String url) {
			System.out.println("Serach(url)::invoked.");
			}//sreach
			
		};//익명구현객체 
		
		rc3.sreach("http://ww");				//다형성-2
	
		
	}//main
	
}//end clasa
