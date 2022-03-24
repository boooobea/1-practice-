package Generic;



public class Util {	//Utility class -> 'helper class'(Math.random)
	

	//제네릭 메소드 선언 
	public static <T> Box<T> boxing(T t){
		
		Box<T> box = new Box<>();
		
		box.setT(t);
		
		return box;
		
	}//Box
}//end class
