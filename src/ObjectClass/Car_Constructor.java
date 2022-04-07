package ObjectClass;

public class Car_Constructor {
	//필드Field (모델링 대상 객체의 속성과 종류의 값을 정의)
	//클래스안에 정의된 변수==필드, 메서드에 포함되지 않는다.
	
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	
	
	int maxSpeed = 350;		//최대속도
	int speed;   			//현재속도
	
//	---
//	//필드 선언만 한 상태 -> 생성자를 통해 초기화 된다. 
//	
//		String company;
//		String model;
//		String color;
//
//		int maxSpeed;			//최대속도
//		int speed; 				//현재속도
//	
//		
// 	//컴파일러가 자동으로 만들어주는 기본생성자
//	    public Car(int maxSpeed){ 			//public class이면 public 붙여준다.
//	    	this.maxSpeed = maxSpeed;
//	    }//default constructor
	
//	---
	
//	String color;
//	int cc;
//	
//		Car2(String color, int cc){
//			;;
//		}//user-defined constructor

//	---
	
		//필드
//		String company = "현대자동차";
//		String model;
//		String color;
//		int maxSpeed;
		
//생성자 오버로딩(constructor overloading->다중정의)
//원칙: 각 생성자의 매개변수의 개수/순서/타입이 달라야함 
		
		//생성자
//		Car(){
//			;;
//		}// 기본생성자
//
//	
//		Car(String model){
//			this.model = model;
//		}// 생성자1
//		
	
//		Car(String model, String color){
//			this.model = model;
//			this.color = color;
//		} //생성자2
//		
//		
//		Car(String model, String color, int maxSpeed){
//			this.model = model;
//			this.color = color;
//			this.maxSpeed = maxSpeed;
//		} //생성자3 
		
		
//		----
		
		Car(){
			this(null);	
		}// 기본생성자
		//this 키워드의 2번째 용법, 매개인자값을 넣어서 호출 
		//this()문법을 통해, 다른 생성자를 호출하는 기능
		Car(String model){
//			this(model,null,0); //생성자3호출 
			this(model,null); 	//생성자2호출
		}// 생성자1
		
		Car(String model, String color){
			this(model, color, 0);//생성자3호출 
		} //생성자2
		
		Car(String model, String color, int maxSpeed){
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		} //생성자3 
		
		
		
		
}//end class
