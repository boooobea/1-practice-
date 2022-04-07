package ObjectClass;

public class Sample {

		String name; 						//인스턴스필드 
		int age; 							//인스턴스필드 
		
		static double weight;				//static필드 
		static double hieght;				//static필드
		
		
		void instanceMethod() {
			System.out.println("instanceMethod() invoke");
			//인스턴스 메서드 블록내에서 
			//1. 인스턴스 필드 사용
			System.out.println("1. name :" + name);
			System.out.println("2. age : " +age );
			
			//2. 인스턴스 메소드 사용 
			instanceMethod2(); 
			
			//3. 정적 필드 사용
			System.out.println("3. weight : " + weight);
			
			//4. 정적 메소드 사용 
			staticMethod();
		}//instance method
		
// ** 인스턴스 메서드 블록내에서는 모두 사용가능하다(인스턴스멤버 ok, 정적멤버ok)
// ** 정적 메소드 블록내에서는, 정적 멤버만 사용가능하다(인스턴스멤버x , 정적멤버ok) 			

		void instanceMethod2() {;;}
		
		static void staticMethod() {
			System.out.println("staticMethod() inboke");
		}		//staic method
		
		public static void main(String[] args) { //static method

			Sample obj = new Sample(); 
			System.out.println("1. name: " + obj.name);
			System.out.println("2. age: " + obj.age);
			
			//정적 멤버(필드, 메소드)는 객체(인스턴스)의 소속이 아니라 clazz객체의 멤버이기 때문에,
			//인스턴스의 참조(주소)를 가지는 참조변수로 사용하지 않는것이 바람직하다. 
			//정적멤버의 사용방법 : "클래스명.정적멤버 "
			
			System.out.println("3. weight :" + Sample.weight);
			System.out.println("4. hieght: " + Sample.hieght);
			Sample.staticMethod(); //정적메소드 호출도 정적멤버 사용과 동일 
			
			
//			-----
			//인스턴스 멤버는 인스턴스 멤버답게, 인스턴스의 주소를 가지고 있는 "참조변수.인스턴스(정적)멤버"
			//로 사용해야한다.
//			Sample.name; 
//			Sample.instanceMethod();


	}//main
}//end class

//			
//			//결론1: static 블록내에서, static 멤버(필드+메소드) 사용은 문제가 없다.
//			System.out.println("1. weight = "+weight);
//			staticMethod();					//static member 사용 
//
////			---
//			
//			//결론2: static 블록내에서, instance멤버(필드+메소드)는 사용불가 
//			System.out.println("2.name : " + name); //instance field 사용안됨 
//			instanceMethod();						//instance Method 사용안됨
//			
