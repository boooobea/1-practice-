package IO.Object;

import java.io.Serializable;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class ClassC implements Serializable {

	//무작위 정수값을 생성하여 넣어준다(compiling)
	//직렬화할 필요가 있는 클래스를 선언할 때에는, 
	//자바컴파일러에게 자동추가 맡기지 않고 직접 초기화하여 유연성을 이용한다. 
	// UID가 같으면 필드 내부구성이 바뀌어도 같은 클래스로 판단한다. 
	private static final long serialVersionUID = 6666L;
	
	int field1; 
	
	//객체의 직렬화 후 새로운 필드 추가 -> 컴파일 ->UID변경 
	int field2; 
	
}//end class
