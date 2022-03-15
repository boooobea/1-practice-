package Annotation.temp;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


//java Refrection API를 이용하여, Service클래스에 붙여놓은 MyAnnotation이름의 어노테이션 정보를 가져오기

public class MyAnnotationExample {
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//method 영역에, Service타입에 대한 정보를 모두 가지고 있는 clazz객체가 없다면
		//new 연산자로 객체를 생성할 수 없다. 
		//ClassNotFoundException 오류가 발생한다. 
		Service s = new Service(null, 10);
				
//		---
		
		Class clazz = Service.class; 		//class 타입에 clazz = Service클래스의 정보(clazz)를 담는다. 
		Method[] methods = clazz.getDeclaredMethods();//**getDeclaredMethods()-모든 메소드를 배열로 가져온다. 
													  //Method[]타입이기 때문에 Method[]타입의 변수(methods)에 값을 담는다.
													  //Method의 정보를 가져온다. 
		for(Method method : methods) {
			System.out.println("1.method : " + method);
		}//enhanced for
		
//		---
		
		Method instanceMethod = methods[0];				//메소드를 담는 메소드 클래스
		Method staticMethod = methods[1];
		
//		---
		
		boolean isPresent = instanceMethod.isAnnotationPresent(MyAnnotation.class);
																//**isAnnotationPresent()-Annotation을 가지고 있는지확인
																//
															   	//MyAnnotation의 clazz정보를 매개변수로 넣는다. 
		System.out.println("2.isAnnotationPresent : " + isPresent);
		
//		---
		
		MyAnnotation myAnnotation = 
				instanceMethod.getAnnotation(MyAnnotation.class); //**getAnnotations()-Annotation을 가져온다.
														 		  //MyAnnotation의 clazz정보를 매개변수로 넣는다. 
		System.out.println("3. myAnnotation : " + myAnnotation);
		
//		---
		
		String value = myAnnotation.value();
		int number = myAnnotation.number();  
		System.out.println(String.format("value: %s, number: %d", value, number));
							//**String.format()-String클래스의 foramt메소드
							//  ("포맷팅할 문자열", objcet, objcet ...);
		
//		---
		//Objcet :
		//MyAnnotation 붙어있는 메소드가 호출될때, 
		//메소드 호출로그를 우리가 직접 코딩하는게 아니라, 
		//자동으로 메소드 호출로그를 출력하는 기능을 구한하는것이다. 
		instanceMethod.invoke(new Service("bibian", 23), 100);
	
		
		
		
		
	}//main
	
}//end class
