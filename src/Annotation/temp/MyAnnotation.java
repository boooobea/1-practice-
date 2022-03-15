package Annotation.temp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Annotation 어노테이션 유지 범위 설정  
@Retention(RetentionPolicy.RUNTIME)


//Annotation 사용범위 제한				//ElementType[] value(); - 엘리먼트타입의 열거상수 
@Target(value={ 						/*class name.value name */
		ElementType.TYPE , 				//class,interface
		ElementType.FIELD,
		ElementType.METHOD,
		ElementType.PARAMETER,
		ElementType.CONSTRUCTOR,
		ElementType.LOCAL_VARIABLE,
		ElementType.PACKAGE,
		ElementType.ANNOTATION_TYPE })	//annotation, 자기자신에게 적용할 수 있다. 
//		ElementType.TYPE_USE})			//TYPE_USE(타입, 필드, 생성자, 지역변수, 매개변수ok, 패키지x, 메소드x )
		

@MyAnnotation
public @interface MyAnnotation {
	
	//속성(정확히는, 엘리먼트) 선언(like field)
	String value()	default "-";		//기본속성 , 문법주의()//기본값이 설정되어있으면 값을 안주어도 되지만 
	int number() default 30; 			//default 키워드 없이 값이 설정되어 있지 않으면 반드시 값을 줘야한다. 
	
}//end MyAnnotation
