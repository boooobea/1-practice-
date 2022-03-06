package first;

public class test2_2{
	public static void main(String[] args) {
		
	int[] intArray = {87, 13, 5, 99, 133, 30, 27};
	
	for(int i=0; i<intArray.length; i++) { //배열의 인덱스를 하나씩 선택
		System.out.println(intArray[i] + " >");
		
		int sum = 0;
		for(int j=1; j<=intArray[i]; j++) { //1~인덱스값
//			System.out.println(j);
			
			if(intArray[i]%j==0) { 
//				System.out.println(j); 		//주어진값을 나누었을때 떨어지는 약수
				sum+=j;
				
			}//if
		}//inner-for
			if(sum==intArray[i]+1) { //소수는 약수의 합이 자기자신+1
				System.out.println("소수입니다.");
			} else {
				System.out.println("소수가 아닙니다. ");
			}
	}//outer-for
			
//	---
			
		}//mains
}//end class 
