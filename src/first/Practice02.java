package first;

import java.util.Arrays;
import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		
		int[] arr = {10 , 20 , 30 , 50 , 3 , 60 , -3};
/*		
//1. arr배열중에서 인덱스가 1인곳의 값을 출력해보자 

		System.out.println(arr[1]);
		
		
//2. arr 배열 중에서 값이 60인곳의 인덱스를 출력해보자. 
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==60) {
				
				System.out.println("arr["+i+"]");
			}//if
		}//for

		
//3. arr 배열 안의 모든 값을 더하고, 총합과 평균을 출력해보자 
		
		int sum = 0;
		double avg = 0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			
		}//for
		System.out.println("총합:"+sum);
		avg = (double)sum/arr.length;
		System.out.println("평균:"+avg);

		
//4. 배열의 인덱스가 3인곳은 출력하지 말고 나머지만 출력해보자. 
		
		for(int i=0; i<arr.length; i++) {
			
			if(i==3) {
				continue;
			}
			System.out.println("arr["+i+"]="+arr[i]);
		}//for

		
//5. arr 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("변경하고 싶은 인덱스 번호를 입력하세요.");
		int num = scanner.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			
			if(num == i) {
				
				arr[i] = 1000;
			}//if
		}//for
		System.out.println(Arrays.toString(arr));
		
//6. 인덱스 번호 2개를 입력받아, 그 값을 서로 바꿔보자. 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("인덱스 번호를 2개 입력하세요.");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			
			int tmp = arr[a];
			arr[a] = arr[b];
			arr[b] = tmp;
			}//for
		System.out.println(Arrays.toString(arr));
			
//7. arr 배열의 요소에서 최대값과 최소값을 구해보자 
		
		int max = arr[0];
		int min = arr[0];
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
			
		}//for
		System.out.println(String.format("최대값:%d , 최소값:%d", max, min));
		
//8. char 배열을 생성하여, 알파벳 A~Z까지 대입한 후 출력해보자. 알파벳은 26개 
		
		char[] ch= new char[26];
		
		for(int i=0; i<ch.length; i++) {
			
			ch[i]=(char)(65+i);
		}//for
		System.out.println(Arrays.toString(ch));
		

//9. 역순으로 출력해보자. 
		
		char[] ch= new char[26];
		
		for(int i=0; i<ch.length; i++) {
			
			ch[i]=(char)(90-i);
		}//for
		System.out.println(Arrays.toString(ch));
		

//10. 양의 정수 10개를 입력받아 배열에 저장하고, 
//배열에 있는 정수 중에서 3의 배수만 출력해보자.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 10개를 입력하세요.");
		int[] a = new int[10];
		
		for(int i=0; i<a.length; i++) {
			a[i] = scanner.nextInt();
		}//for
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%3==0) {
				System.out.println(a[i]);
			}
		}//for
 */		
	}//main
}//end class
