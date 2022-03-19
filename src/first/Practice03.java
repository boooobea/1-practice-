package first;

import java.util.Arrays;

public class Practice03 {

	public static void main(String[] args) {
		
/*	//1. for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구해보자.
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			
			if(i%3==0) {
				sum += i;
			}//if
			
		}//for
		System.out.println("3의 배수의 총 합 = "+sum);

		
*/		
/*	//2. while문과 Math.random()메소드를 이용해서 두 개의 주사위를 던졌을 때 
	//나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 
	//눈의 합이 5이면 실행을 멈추는 코드를 작성하시오.
		
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			
			int plus = num1+num2;
			
			if(plus!=5) {
				System.out.println(String.format("눈1= %d, 눈2= %d, 합=%d", num1, num2, plus));
				System.out.println("replay");
			} else {
				System.out.println(String.format("눈1= %d, 눈2= %d, 합=%d", num1, num2, plus));
				System.out.println("---주사위를 멈춥니다---");
				break;
			}
		}//while
*/
/*		
		//3. 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 
		//(x, y) 형태로 출력하시오. 단, x와 y는 10이하의 자연수입니다.
		
		for(int i=0;i<=10;i++) {
		
			for(int j=0; j<=10; j++) {
				
				int num = (i * 4) + (5 * j);
				
				if(num==60) {
					System.out.println("("+i+", "+j+")");
				}
				
			}//inner-for
			
		}//outer-for
*/
/*		
		//4. 다음 2차원 배열 n 을 출력하는 코드를 작성하세요.
		//int[][] n = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2} };
		
		int[][] n = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2} };
		
		for(int i=0; i<n.length; i++) {
			System.out.println(Arrays.toString(n[i]));
		}//for
*/		

/*		//5. 별찍기를 해보자ㅠㅠ (사각형)
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}//inner-for
			
			System.out.println(" ");
		}//outer-for
*/		
		//5-1. 별찍기를 해보자(세모)
		
/*		for(int i=1; i<5; i++) {
			
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}//inner-for
			System.out.println(" ");
			
		}//outer-for
*/
		
/*		//5-2. 별찍기를 해보자(반대세모)
		
		for(int i=1; i<5; i++) {
			
			for(int j=5; j>i; j--) {
				System.out.print("*");
				
			}//inner-for
			System.out.println("");
		}//outer-for
*/
		
/*		//6. 구구단을 출력 
		
		for(int i=2; i<=9; i++) {
			System.out.println( i + "단");
			for(int j=1; j<=9; j++) {
				
				System.out.println("\t"+ i +"x"+ j + " = " +(i*j));
				
			}//inner-for
		}//outer-for
*/
		
		//7. 1부터 100까지 수 중에 3의 배수이거나 7의 배수인 수의 합을 구하는 프로그램을 만드시오

/*		int sum = 0;
		for(int i=1; i<=100; i++) {
			
			if(i%3==0 | i%7==0) {
				
				if(i%(3*7) !=0) {
					sum += i;
				}//if
			}//if
			
		}//for
		System.out.println("3의배수 이거나 7의배수의 합 =" + sum);
*/

		
	}//main
	
}//end class
