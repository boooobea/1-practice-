package Switch;

public class SwitchSample2 {

	//java 12 : Switch Expression #2 
	public static void main(String[] args) {
		
		int number = 10;
		int result = switch(number) {
						case 1 -> 100;
						case 2 -> 1+2+3;
						default -> 0;
						case 3 -> number;
						case 5 -> 400;
//						case 4 -> true; //type missmatch 
					}; //switch expression 
					System.out.println(result);
	}//main
}//end class
