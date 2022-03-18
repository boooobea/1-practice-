package Inheritance;

//다형성
public class AnimalExample {

	public static void main(String[] args) {
		/*다형성1 : 상속관계의 두 참조타입이 있을때 
		* 부모 > 자식으로 자식타입 객체가 부모타입 변수에 대입가능 
		* 부모는 단순 직계뿐만 아니라 조상까지 포함된다. */
		
		Animal animal = new Animal_dog();  //부모타입 참조변수 = new 자식객체;
		
		
		/*다형성2: 다형성1을 충족한다면 부모타입의 참조변수의 메소드를 호출했을때 
		* 부모타입객체의 메소드가 아니라 부모로부터 상속받은 메소드가
		* '오버라이드'되었을때 이 오버라이드 된 메소드가 호출된다. */
		
		animal.sound();			    //다형성2:오버라이드 되어 자식(Dog)메소드 호출됨
		
//		---
		
		Animal animal2 = new Animal_cat();	//부모타입 참조변수 = new 자식(cat);
		animal2.sound();			//다형성2:오버라이드 되어 자식(cat)메소드 호출됨
		
		
		
	}//main
	
}//end class
