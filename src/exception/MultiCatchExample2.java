package exception;


public class MultiCatchExample2 {
	
	//메소드를 선언할때(인스턴스/정적) 발생가능한 예외를 선언한다.
	private static void staticmethod(String name) throws Exception  { 
	
		//발생가능한 예외의 객체를 만들어서 되돌려줌 throw
		throw new IllegalArgumentException();
		/* 부적절한argument 예외 : Exception에도 다형성이 적용-1
		/* 내부에서 예외가 발생하지 않아도 컴파일 오류는 생기지 않는다.
		 * 예외타입 기본생성자 -> 메세지가 없음 */
	}//staticMethod

	
	public static void main(String[] args) throws Exception {
		
//	try {
//		String data1 = args[0];
//		String data2 = args[1];
//			
//		int value1 = Integer.parseInt(data1);
//		int value2 = Integer.parseInt(data2);
//			
//		int result = value1 + value2;
//			
//		System.out.println(data1 + "+" + data2 + "=" + result);
		
		//예외가 발생가능한 메소드이기 때문에 메인쓰레드에도 throws 추가된다. 
		MultiCatchExample2.staticmethod("1000");
		// printStackTrace() : 예외의 정보를 출력 
		
		
		//여러개의 예외처리를 중복하여 넣을 수 있다.
//	} catch(ArrayIndexOutOfBoundsException | NumberFormatException |NullPointerException e) {		
//		System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
//		
//	} catch(Exception e) {				
//		System.out.println("알 수 없는 예외 발생");
//			
//	} finally {										
//		System.out.println("다시 실행하세요.");
//	}//try-catch-finally
}//main
	
}//end class
