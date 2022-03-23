package exception.backing;


//사용자 정의 예외클래스 선언:비즈니스 상 예외를 의미 
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class InvalidAcountException 
	extends RuntimeException{ 			//컴파일 예외가 아닌 런타임 예외 
	
	
	public InvalidAcountException(String message) {
		super(message);
	}//constructor
	
}//end class
