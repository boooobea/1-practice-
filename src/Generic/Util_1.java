package Generic;


public class Util_1 {

	public static<T extends Number> int compare(T t1, T t2) {
		
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
//		--- Number의 기본 추상메소드가 있기때문에 가능 
		Integer i = 100;
		i.intValue();
		i.doubleValue();
//		---
		return Double.compare(v1, v2);
	
	
	}//compare

}//end class
