package ObjectClass;

public class SingletonExample01 {


	//Singleton-> 객체주소가 같다 = 객체가 하나고, 객체주소를 반환하는 참조(주소)도 하나이다.
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			Singleton obj = Singleton.getInstance();
			System.out.println(obj);
		}//for
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		
		assert (1 == 2);  	//assert(검증) true면 지나가지만 false면 error발생
		//JDK 버전에 따라 실행이 되지 않는다. 
		System.out.println("ok");
		
	}//main
	
}//end class
