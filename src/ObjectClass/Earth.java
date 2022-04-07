package ObjectClass;

public class Earth {
//static final, final 
//변수의 값을 보존하기 위한 키워드 
	
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;

	final int age=0; 

	
	//표현식을 값으로 지정할 수 있다. 
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}//static initializer
	
	void instanceMethod(final String name) {
		final int temp = 0;
		
	}//instanceMethod
	
}//end class
