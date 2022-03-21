package Inheritance;



public class abs_AnimalExample {

	public static void main(String[] args) {
		
		//1.자식객체 생성
		abs_Dog dog = new abs_Dog();
		abs_Cat cat = new abs_Cat();
		
		
		//2.각 자식객체의 메소드 
		dog.sound();	//자식객체의 메소드를 단순 호출
		cat.sound();
		System.out.println("---사용관계로써의 자식객체 활용");
		
//		---
		
		//변수의 자동 타입 변환
		abs_Animal animal = null;	//부모타입 변수선언
		animal = new abs_Dog();		//다형성-1
		animal.sound();				//다형성-2
		animal = new abs_Cat();
		animal.sound();
		
		System.out.println("---다형성으로서의 객체 활용");
	
//		---
		
		//매개변수의 자동 타입 변환
		
		animalSound(new abs_Dog());		
		animalSound(new abs_Cat());
		
		
	}//main - 메인메소드이기 때문에 호출하려면 정적(static)으로 해야한다. 
	
	public static void animalSound(abs_Animal animal) {	//매개변수의 다형성-1
													//부모타입 자식객체 
		animal.sound();				//다형성-2 
	}//animalSound
	
	
}//end class