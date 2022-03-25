package Lambda;

import lombok.NoArgsConstructor;

//익명구현객체의 주소-this, closure 
@NoArgsConstructor
public class Sample {
	
	String name = "bibian";
	int age = 23;
	
	private void instanceMethod2() {;;}

	public void instanceMethod(int param) {
		int temp = 333;
		
		MyFunctionalInterface fi = a->{
		/* 람다식 this : 람다식이 만든 익명구현객체의 주소를 가지고 있지 않고
		 * 오히려, 람다식을 포함하고 있는 바깥타입의 객체 주소를 가지고 있다.*/
			System.out.println("2.this :" + this);
			System.out.println("3.name :" + this.name);
			System.out.println("4.age :" + this.age);
		/* this가 가리키는 클래스의 멤버, 지역변수, 매개변수, 메소드 사용 가능 */

		/* 생명주기가 다른 지역변수를 익명객체가 사용한 경우, 
		 * 먼저 파괴되는 지역변수의 값을, 익명객체가 결정할 수 없는 
		 * 상태에 빠지게 되는데 이 상태를 "Closure"(클로져)라고 한다. */
			System.out.println("5.temp :" + temp);
			System.out.println("6.param: " + param);
			
			this.instanceMethod2();
			
			return 77;
		};
		
	 fi.method4(23);
	}//instanceMethod
		
}//end class
