package IO.Object;

import java.io.Serializable;

import lombok.NoArgsConstructor;


//lombok : 직렬화/역직렬화에서도 사용가능 
@NoArgsConstructor
public class ClassB implements Serializable {
 
	int field1;
}
