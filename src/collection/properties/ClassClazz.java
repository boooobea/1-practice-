package collection.properties;

import java.util.Properties;

public class ClassClazz {

	
	public static void main(String[] args) throws Exception {
		
		Properties properties = new Properties();
		
		/* clazz 객체를 얻어내는 방법3가지 */
		// (1) 타입명.class 속성을 이용하는 방법 
		Class clazz1 = Properties.class; 
		
		// (2) 참조타입변수명.getClass()를 이용  
		Class clazz2 = properties.getClass();
		
		// (3) FQCN 이름과 Class.forName(FQCN)를 이용
		Class clazz3 = Class.forName("java.util.Properties");
		
		System.out.println("clazz1 : " + clazz1);
		System.out.println("clazz2 : " + clazz2);
		System.out.println("clazz3 : " + clazz3);
		
		System.out.println("clazz1 == clazz3 : " + (clazz1 == clazz3));
		System.out.println("clazz1.equals(clazz3) : " + clazz1.equals(clazz3));
	}//main
	
}//end class
