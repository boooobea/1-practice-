package Generic;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//제네릭 타입 클래스 선언 - 멀티타입 파라미터를 가진다.
@ToString
@Setter
@Getter
@NoArgsConstructor
public class Product<T, M> {
	
	private T kind;
	private M model;
	
	
}//end class
