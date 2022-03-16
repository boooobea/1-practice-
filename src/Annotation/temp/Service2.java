//------- Annotation의 사용범위 # 2

//package - XX
//@MyAnnotation
package Annotation.temp;

////class 
/*필드타입+변수명 = 사이에는 다른것을 첨부할 수 없다.필드, 메소드, 지역변수, 매개변수 동일*/

//@MyAnnotation public class Service2 { 				//OK
public @MyAnnotation class Service2 { 					//OK
//public class @MyAnnotation Service2 {					//XX
	
/*필드타입+변수명 = 사이에는 다른것을 첨부할 수 없다.필드, 메소드, 지역변수, 매개변수 동일*/
 ////field - OK
	
	@MyAnnotation public String instanceField; //OK
//	public @MyAnnotation String instanceField; //OK
//	public String @MyAnnotation instanceField; //XX
	
	@MyAnnotation
	private static int staticField;
	
	
//	@MyAnnotation private static final double PI = 3.14;	//OK
//	private @MyAnnotation static final double PI = 3.14;	//OK
//	private static @MyAnnotation final double PI = 3.14;	//OK
	private static final @MyAnnotation double PI = 3.14;	//OK
//	private static final double @MyAnnotation PI = 3.14;	//XX
/*필드타입+변수명 = 사이에는 다른것을 첨부할 수 없다.필드, 메소드, 지역변수, 매개변수 동일*/
	
	
////constructor-initializer OK / XX 
	
//	@MyAnnotation public Service2(@MyAnnotation String instanceField, @MyAnnotation final int age){ //ok
	public @MyAnnotation Service2(					//OK
			
			@MyAnnotation String instanceField, 	//OK
//			String @MyAnnotation instanceField, 	//XX
						
			@MyAnnotation final int age  ){ 		//OK
//			final @MyAnnotation int age  ){ 		//OK
//			final int @MyAnnotation age  ){			//XX
		
		;;
	}//default constructor
	
//	@MyAnnotation						
//	static {
//	}//static initializer				//static initializer 허용안됨 
//	/**/
	
	
	
	
////method	
	/*리턴타입 변수명 = 사이에는 다른것을 첨부할 수 없다*/
	
	@MyAnnotation public void instanceMethode(@MyAnnotation int age) { 		//OK
		
//	public @MyAnnotation void instanceMethode(@MyAnnotation int age) {		//OK
//	public void @MyAnnotation instanceMethode(@MyAnnotation int age) {		//XX
		
//		@MyAnnotation final int tmp; 				//OK
		final @MyAnnotation int tmp; 				//OK
//		final int @MyAnnotation tmp;				//XX
	}//instanceMethod
	
	
	@MyAnnotation
	public void staticMethod() {;;}//staticMethod
	
	
}//end class
