package Operator;


public class IncreaseDecreaseOperator {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		System.out.println("--------------------------");
		//대전제 : 증감연산자가 단독으로만 사용되는 경우에는, 전위/후위의 의미가 없다.
		x++; //후위 증가 연산자
		++x; //전위 증가 연산자 
		
//		x = x+1;  =>  x++ or ++x
		
		System.out.println("1. x="+x);

		
		System.out.println("--------------------------");
		y--; //후위 감소 연산자 
		--y; //전위 감소 연산자 

//		y = y-1;  =>  y-- or --y
		System.out.println("2. y="+y);
		
		System.out.println("--------------------------");
		
		System.out.println("3. x="+x);
		z = x++; //**후위 증가연산자 사용 
//		z = x;
//		x = x+1;
	
		
		System.out.println("4. z="+z);
		System.out.println("5. x="+x);
		
		System.out.println("--------------------------");
		
		z = ++x; //**전위 증가연산자 사용 
		
//		x = x+1;
//		z = x;
		
		System.out.println("6. z="+z);
		System.out.println("7. x="+x);
		System.out.println("7. y="+y);
		
		System.out.println("--------------------------");
		
		// x:전위, y:후위 
		z = ++x + y++;
		
		x = x+1;
		z = x+y;
		y = y+1;
		//가독성있는 코드를 만들것 
		
		System.out.println("8. z="+z);
		System.out.println("9. x="+x);
		System.out.println("10. y="+y);
		
		
	}//main
}//end class
