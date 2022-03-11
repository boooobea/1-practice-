package StudyPaper;

public class Cookie {
//Field - constructor
		String company = "과자가게";
		String model;
		String tasty;
		int price; 
		int bonus;
		
		
////--기본생성자 (Default Constructor)	
////모든클래스에는 생성자가 있어야 하며 선언을 생략하면 컴파일러가 기본생성자를 추가 
//		[public] class name(){} 
//
//		public Cookie(){
//			;;
//		}//default constructor
//		
//		 
////-- 개발자가 직접선언 
////parameter 선언, new 객체 생성에서 argument입력
//		Cookie(int price){
//			//객체의 초기화 코드
//			//매개변수가 없는것은 초기화 할변수가 없음 
//			this.price = price;
//		}//User-Constructor
//		
//		
////-- 생성자 오버로딩(constructor overloading) - 다중정의 
////		전체필드 또는 부분필드를 초기화 시킬때 
////      각 생성자의 매개변수의 개수/순서/타입이 달라야한다.
//// 		this. 생성된 객체의 주소가 담겨있다. 		
//		Cookie(){
//			;;
//		}//-기본생성자 
//		
//		Cookie(String model){
//			this.model=model;
//		}//-생성자1
//		
//		Cookie(String model, String tasty){
//			this.model=model;
//			this.tasty=tasty;
//		}//-생성자2
//		
//		Cookie(String model, String tasty,int price){
//			this.model=model;
//			this.tasty=tasty;
//			this.price=price;
//		}//-생성자3 
//		
//-- 중복코드를 제외하기 위해 생성자를 호출하여 사용할 수 있다. 
//		this()문법으로 다른 생성자를 호출 
		
		Cookie(){
			;;
		}//-기본생성자 
		
		Cookie(String model){
			this(model,null);
		}//-생성자1 : 생성자2를 호출 
		
		Cookie(String model, String tasty){
			this(model,tasty,0);
		}//-생성자2 : 생성자3을 호출 
		
		Cookie(String model, String tasty,int price){
			this.model=model;
			this.tasty=tasty;
			this.price=price;
		}//-생성자3 : 모든필드를 초기화하는 생성자 
		
}//end class
