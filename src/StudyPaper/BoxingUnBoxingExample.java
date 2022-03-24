package StudyPaper;


/* Wrapper Type */
public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		//1. Boxing
		//객체 생성시 매개변수로 값을 입력하며 생성 
		Integer obj1 = new Integer(100);		//Deprecated
		Integer obj2 = new Integer("200");
		
		Integer obj3 = Integer.valueOf("300");
		
		
		//2. UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		
		//3. boolean 의 박싱/언박싱 
		Boolean bool1 = new Boolean(true);
		Boolean bool2 = new Boolean("true");
		
		Boolean bool3 = Boolean.valueOf(true);
		Boolean bool4 = Boolean.valueOf("true");
		//valueof : 기본값으로부터 래퍼타입의 객체를 생성해 내는 메소드 
		
		Boolean bool5 = Boolean.parseBoolean("false");
		//parse xxx : 문자열을 받아 기본타입으로 돌려주는 메소드 
		System.out.println("bool5: " + bool5);
//		---
		boolean b1 = bool1.booleanValue();
		boolean b2 = bool2.booleanValue();
		boolean b3 = bool3.booleanValue();
		boolean b4 = bool4.booleanValue();
		
	
		//Auto-boxing / Auto-unboxing - wrapper 에 한해서 가능 
		Integer i = 1000;		//Auto-boxing
		int i2 = i;				//Auto-unboxing
			
		
		
	}//main
	
}//end class
