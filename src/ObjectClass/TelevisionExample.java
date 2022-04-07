package ObjectClass;

public class TelevisionExample {
//static 호출
	
	public static void main(String[] args) {
		//정적멤버(필드, 메소드)는 정적멤버답게 사용 
		//클래스명 (.) 필드or메소드 호출 
		//// 인스턴스 - > this 로 호출 
		
		System.out.println(Television.info);
		
// -- 둘다 같다.  정적멤버는 정적멤버 호출에 따라 적용하는것이 바람직 
		
		Television obj = new Television();
		System.out.println(obj.info);
		
		
		
		

	}//main
}//end class
