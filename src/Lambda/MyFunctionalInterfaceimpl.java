package Lambda;

import lombok.NoArgsConstructor;


//1st. method : 직접 구현클래스 선언 

@NoArgsConstructor
public class MyFunctionalInterfaceimpl implements MyFunctionalInterface {

	@Override
	public void method() {
		System.out.println("MyFunctionalInterfaceimpl::method() invoked.");
		
	}//method

	
}//end class

