package IO.Object;

import java.io.Serializable;

import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@NoArgsConstructor
public class ClassA implements Serializable{

	int field1;

	//집합(부품관계) 필드
	// 이 클래스 역시 serializable 
	ClassB field2 = new ClassB();
	
	
	//정적필드도 직렬화에 포함될까 ? > xx
	static int field3 = 1000; 
	
	//직렬화에서 제외할 필드에는 transient 키워드를 붙인다. 
	transient int field4;
	
	
}//end class
