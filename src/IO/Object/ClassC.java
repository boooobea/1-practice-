package IO.Object;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class ClassC implements Serializable{
	
	//직렬화할 필요가 있는 클래스를 선언할 때에는, 
	//자바컴파일러에게 자동추가를 맡기지 않고, 개발자가 직접 필드와 초기값을 지정하여
	//유연성을 줄 수 있다. 
	private static final long serialVersionUID = 7777777L;

	int field1;
	
	//객체의 직렬화 이후에, 새로운 필드 추가 -> Comfile -> SerialVersionUID 다시 생성 
	int field2;

	
	//private static final long serialVersionUID =컴파일러가 무작위정수값을 생성하여 넣어준다.
}//end class
