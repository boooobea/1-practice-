package StudyPaper;


//Inheritance
/*상속은 부모의 단일상속만 가능
 *extends 키워드사용 
 *상속받은 부모클래스의 필드, 메소드를 사용가능하다*/
public class DmbCellPhoneExample {
	
	public static void main(String[] args) {
		
		//1. 자식클래스의 객체 생성
		DmbCellPhone dmbcell = new DmbCellPhone("코딩폰","화이트",10);
		
		
		//2. 부모클래스의 상속받은 필드 사용
		System.out.println("모델:"+ dmbcell.model);
		System.out.println("색상:"+ dmbcell.color );
		
		
		//3. 자식클래스의 필드사용
		System.out.println("채널:" +dmbcell.channel);
		
		
		//4. 부모클래스의 상속받은 메소드사용
		dmbcell.bell();
		dmbcell.powerOff();
		
		
		//5.자식클래스의 메소드사용
		dmbcell.changeChannelDmb(12);
		
		
	}//main
	
}//end class
