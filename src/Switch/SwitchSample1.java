package Switch;

public class SwitchSample1 {
	//java 12 : Switch Expression 
	public static void main(String[] args) {
		
		int number = 7;
		
		switch(number) {
			case 7 -> {
				System.out.println("7");
			}//case 7
			case 6 -> System.out.println("6");
			//case 6, 실행문이 하나일때는 {} 생략가능 
		}
		
		
	}//main
}//end class
