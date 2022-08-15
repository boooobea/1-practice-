package Lambda;


//Lambda expressions - 기본문법
public class MyFunctionalInterfaceExample {
 
	public static void main(String[] args) {
		
		MyFunctionalInterface fi;
		
//		Sample ttt = new Sample();
//		System.out.println("1.ttt :" + ttt);
////		ttt.instanceMethod();
		
		
/*		--- 문법, 생략조건 ---
		
//		1.case : 생략조건1: 블록내의 실행문이 한개이면 { } 생략가능
		fi = ()-> System.out.println("anonymous by lambda::method() invoked.");
		fi.method();	
		
//		2.case : 생략조건2: 매개변수의 타입은 생략가능
//			     생략조건3: 매개변수가 하나면 ( ) 생략가능 
		fi = age->System.out.println("anonymous :: method2()");
		fi.method2(23);	
		
//		3.case : 생략조건4: 생략조건1일때 return문만 있으면 중괄호 생략가능 
		값을 생성하는 자리에는 리터럴, 변수, 표현식, 값을 리턴하는 메소드 가능
		fi = ()-> 100 + 200;
		
//		4.case : 
		fi = a-> (int)(1+2*3-4/a);
		fi.method4(23);
*/		
		
		
/*		--- 메소드 실행을 위해 객체 생성 -- 
 */		
 
		//1st. method : 직접 구현클래스 선언 
		fi = new MyFunctionalInterfaceimpl(); 	//다형성-1
		fi.method(); 						  	//다형성-2 
		
		
		//2st. method : 익명구현객체 선언 
		fi = new MyFunctionalInterface() {		//다형성-1
			@Override
			public void method() {				
				System.out.println("anonymous::method() invoked.");
			}
		};//익명구현객체(인터페이스) 
		fi.method(); 							//다형성-2
		
		
		//3st method : 람다식 구현 
		fi = ()-> {								//다형성-1
				System.out.println("anonymous by lambda::method() invoked.");
		};//람다식을 이용한 익명구현객체 
		fi.method();							//다형성-2
		
		
/*		--- 기본 문법 --- 
		fi = ()->{
			String str = "method call";
			System.out.println(str);
		}; 			  //람다식 : fi에 선언된 추상메소드를 Override하는 익명구현객체 생성 
		
		fi.method(); //fi에 선언된 추상메소드 호출(다형성-2)
*/		
	}//main
	
}//end class
