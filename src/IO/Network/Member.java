package IO.Network;

import java.io.Serializable;

import lombok.Data;


@Data
//@NoArgsConstructor @Getter @Setter @ToString @EqualsAndHashCode 

/*  Mission Critical Business Data 저장용도의 자바빈즈 클래스 생성 
 * "자바빈스(JavaBeans)"클래스란 중요한 비즈니스 데이터를 저장하는 용도의 클래스.
 *  1) private 접근제한자로 필드를 선언(필수) 
 *  2) 모든 필드에 대해서 각 필드의 getter 메소드와 setter 메소드를 갖는다(필수)
 *  3) 기본 생성자가 반드시 존재해야 된다(필수) 
 *  4) implements Serializable (선택) 
 */

// 자바빈즈 클래스라면 필드(객체의 속성)와는 다른 "프로퍼티(property)라는 가상의 개념이 생긴다.
// property : 'get','set'을뺀 Camel기법을 취소한 필드이름

// String name ==> setMyName() ==> 'set'제거 ==> 'MyName' ==> 'myName' 
public class Member implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private Integer age;
	
}//end class
