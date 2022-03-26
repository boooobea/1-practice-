package Lambda.API;

import java.util.function.IntSupplier;


//Supplier
public class SupplierExample {
//리턴타입을 돌려줌 getAs()
	
	public static void main(String[] args) {
		
//		int getAsInt();
		IntSupplier intSupplier = () ->{
			int num = (int)(Math.random()*6)+1;
			return num;
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("주사위 눈의 수: " + num );
		
	}//main
	
}//end class
