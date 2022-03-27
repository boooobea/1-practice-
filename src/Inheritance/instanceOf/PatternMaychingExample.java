package Inheritance.instanceOf;


/* instanceOf - Pattern Matching */
public class PatternMaychingExample {

	public static void main(String[] args) {
		
		Object obj = "Hello, world";
		
		if(obj instanceof String) {
			String s =(String)obj;
			
			System.out.println(s.length());
		}
		
//		---
		
		if(obj  instanceof String s1) {
			
			System.out.println(s1.length());
		}
	}//mains
	
}//end class
