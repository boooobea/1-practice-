package exception;

public class CatchOrderExample {
	
	public static void main(String[] args) {
		
	try {
		
		String data1 = args[0];
		String data2 = args[1];
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		
		System.out.println(data1 + "+" + data2 + "=" + result);
	
	/* 예외처리 순서를 자식-부모순서로 놓아야 예외를 모두 처리할 수 있다.
	 * Exception은 예외의 최고조상이므로 마지막에 넣는다.*/
	} catch(ArrayIndexOutOfBoundsException e) {		
		System.out.println("실행 매개값의 수가 부족합니다.");
		
	} catch(Exception e) {				
		System.out.println("실행에 문제가 있습니다..");
		
	} finally {		           //(optional)항상 실행할 코드작성 
		System.out.println("다시 실행하세요.");
	}//try-catch-finally
	
	}//main	
}//end class
