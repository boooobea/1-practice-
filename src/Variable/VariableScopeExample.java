package Variable;

public class VariableScopeExample {

	public static void main(String[] args) {
		final int age;
		age = 23;
		
		System.out.println(age);
	
		//-----------------//
		
		int var1;
		
		if(true) {
			int var2;
			
			var1 = 10;
			var2 = 20;
		} //if
		System.out.println(var1);
//		System.out.println(var2);
		
		//----------------//
		
//		var1 = 10;
//		//var2 = 20;
//		
//		for(int i=0; i<1; i++) {
//			int var3;
//			
////			var1 = 10;
//		}
	}//main
}//end class 
