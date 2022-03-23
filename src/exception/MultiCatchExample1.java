package exception;


public class MultiCatchExample1 {

	public static void main(String[] args) {
		
	try {
		//ArrayIndexOutOfBoundsException 예외 발생가능 
		String data1 = args[0];
		String data2 = args[1];
		
		//NumberFormatException 예외 발생가능 
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		
		System.out.println(data1 + "+" + data2 + "=" + result);
		
	} catch(ArrayIndexOutOfBoundsException e) {		//예외처리 1
		System.out.println("실행 매개값의 수가 부족합니다.");
		System.out.println("[실행방법]");
		System.out.println("java CatchByExceptionKindExample  num1  num2");
		
	} catch(NumberFormatException e) {				//예외처리2
		System.out.println("숫자로 변환할 수 없습니다.");
		
	} finally {										//(optional)항상 실행할 코드작성 
		System.out.println("다시 실행하세요.");
	}//try-catch-finally
	
	}//main	
}//end class
