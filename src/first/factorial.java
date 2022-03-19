package first;

public class factorial {

	public static void main(String[] args) {
/*		(1) n! = n factorial
*			 	if n = 2, 2! = 1 x 2 
*			  	if n = 3, 3! = 1 x 2 x 3
*			  	if n = 7, 7! = 1 x 2 x 3 x 4 x 5 x 6 x 7
*		(2) n!에서 n의 숫자가 몇일때 답이 나오지 않는지 확인
*/
		
	long factorial = 1; 
	int i = 0;
	for(i=1; i<=100; i++) {	//1~n(100이라고가정) 
		factorial *= i;
				
		if(factorial<0) {	//n!==0이면 종료 
			break ;
			}//if
			
//		System.out.println("n = " + i);
		System.out.println(i + "! = " + factorial);
	}//for
	}//main
	
}//end class
