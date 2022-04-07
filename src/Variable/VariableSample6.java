package Variable;

public class VariableSample6 {
	public static void main(String[] args) {
		
		//%(니머지)연산자 
		
		int number = 8;
		
		//이때, 8이 2의 배수(짝수)인지 아닌지를 판단하는 로직을 어떻게 구현하는가 
		
		boolean isEven = number%2==0;
		System.out.println(isEven);
		
		int result = number%2;
		System.out.println(result);
	2	
		int result2 = number%7;
		System.out.println(result2);
		
	}//main
}//end class
