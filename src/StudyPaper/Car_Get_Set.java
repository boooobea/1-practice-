package StudyPaper;

/* 클래스의 필드에 대해서 Getter/Setter 선언시 
 * 이 클래스를 자바빈즈(Java Beans)클래스라고 한다.
 * 이 getter/setter에 의해서 필드(속성)이 아니라, "프로퍼티(property)"라고 하는 개념이 생긴다. 
 */
public class Car_Get_Set {
	//필드
	private int speed;
	private boolean stop;
	
	//생성자 - 기본생성자를 의존  
	
	
	//메소드 - 기능/행위 구현 
	//1.Getter --------- 필드의 값을 변환해서 줘야할 경우가 많음 
	public int getSpeed() { 			//getter
		return speed;
	}//getSpeed
	
	//2.Setter --------- 필드의 값을 설정할때, 무결성 검사 
	public void setSpeed(int speed) { 	//setter
		if(speed >0 ) {
			this.speed = 0;
			
			return;						//무조건 메소드의 실행종료 및 값 반환(있는경우) 
		} else {
			this.speed = speed;
		}//if-else
	}//setSpeed

	//3. boolean 타입의 필드에 대한 getter이름은 'is필드명'으로 정한다. 
	public boolean isStop() { 			//getter--- boolean(true/false)이기 때문에 get에서는 is를 사용 
		return stop;
	}//isStop
	
	//4. 
	public void setStop(boolean stop) {	//setter
		this.stop = stop;
		this.speed = 0;
	}//setStop
	
	
	
}//end class
