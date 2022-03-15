//------- Annotation의 사용범위 # 1 

//package - XX
//@MyAnnotation
package Annotation.temp;								//package : XX NOT permitted

import StudyPaper.MyAnnotation;

//class - OK 
@MyAnnotation
public class Service {							//class : OK 
	
	
 //field - OK
	@MyAnnotation
	public String instanceField; 				//instance : OK
	
	@MyAnnotation
	private static int staticField;				//static : OK
	
	@MyAnnotation
	private static final double PI = 3.14;		//final : OK
	
	
	
//constructor-initializer OK / XX
	
	@MyAnnotation
	public Service(@MyAnnotation String instanceField, @MyAnnotation final int age){
												//Parameter : OK  ,  final :OK  
	}//default constructor						//constructor : OK
	
//	@MyAnnotation						
	static {
	}//static initializer						//static initializer : XX
	/*clazz 영역에 저장되기전에 initializer가 먼저 실행되기 때문에 불가능*/
	
	
	
//method-OK
	
	@MyAnnotation							
	public void instanceMethode(@MyAnnotation int age) {	
												//Parameter : OK
		@MyAnnotation
		int tmp;								//Local variable : OK
	}//instanceMethod							//instance Method : OK
	
	
	@MyAnnotation
	public void staticMethod() 
	{;;}//staticMethod							//static Method : OK  
	
}//end class
