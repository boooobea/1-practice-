package Inheritance;



/* 추상클래스를 통해 적어도 '동물'이라면, 반드시 가져야 할 속성과 기능(행위)를(공통부분)
 * 필드와 메소드로 선언하여, 이를'규격'화 해서, 상속받는 자식 클래스가 반드시 
 * 규격을 지켜 오버라이딩 하게 한다. 
*/
public abstract class abs_Animal {

	public String kind;
	
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}//breath

	//추상메소드(abstract method) : 시그니처(선언부)만 있고 구현부({})가 없다. 
	//이 클래스를 상속받은 모든 자식은 반드시 추상메소드를 오버라이딩 해야한다. 
	public abstract void sound(); 
	
	
}//end class