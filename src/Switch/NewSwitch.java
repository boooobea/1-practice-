package Switch;

public class NewSwitch {
	public static void main(String[] args) {
		//case 1 - 실행문장 수행(JAVA12)
		
		int number = 10;
		
		switch(number) {
			case 1 -> System.out.println(1);	//중괄호기호({})를 없애서, 블록을 생략한경우
			
			case 2 -> {							//중괄호기호로 블록(block)을 생성한 경우
//				System.out.println(2);
				;;
			}
			
			case 10 -> {						
				System.out.println(10);
			}
			
//			default -> {						//값을 생성하여 반환하지 않는 경우는, default case 생략가능
//				System.out.println("No match found"); 	
//			}
		}//switch expression
		
//		---
		//case 2 - 여러값을 매칭시켜 실행문장 수행(JAVA12)
		int number2 = 5;
		
		switch(number2) {
			case 1, 2 	-> System.out.println("1 or 2"); //하나의  
			case 5 		-> System.out.println("3 or 4 or 5");
			
			//값을 생성하여 반환하지 않는 경우는, default case 생략가능
//			default 	-> System.out.println("No match found");
		}//switch expression
		
//		---
		//case 3 - 값을 생성하여 반환하는 표현식으로 사용(JAVA12)
		int number3 = 10;
		
		//(주의) 결과값 반환일시 default case로 값을 꼭 반환해야한다. 생략불가
		int result3 = switch(number3) {
			case 1 	-> 1;
			case 2 	-> 2;
			case 10 -> 10;
			
			default -> -1; 		//생략불가 - 값을 반환해야함
		}; //switch expression
		
		System.out.println("result3: "+result3);
		
//		---
		//case 4 - 값을 생성하되, 복잡한 로직을 수행하여 값을 생성하여 반환하는 경우
		int number4 = 1;
		
		int result4 = switch(number4) {
		// 복잡한 로직을 통해, 값을 생성/반환해야 하는 경우는, `yield` 키워드로 값 반환 (***)
		// `return` 키워드 사용불가 (***)
			case 1, 2 		->{
				yield 1+2;
			}
		// 복잡한 로직을 통해, 값을 생성/반환해야 하는 경우는, `yield` 키워드로 값 반환 (***)
		// `return` 키워드 사용불가 (***)
			case 3, 4, 5 	->{
				System.out.println("3 + 4 + 5 return");
				yield 3 + 4 + 5;
			}
			
			default 		-> -1; //생략불가 -값을 반환해야함 
		}; //switch expression
		
		System.out.println("result4: " + result4);
	
	}//main
}//end class
