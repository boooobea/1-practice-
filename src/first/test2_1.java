package first;

public class test2_1 {
	// 배열을 이용하여, 소수(prime number)인지 판정하기.
	//  -배열: int[] intArray = {87, 13, 5, 99, 133, 30, 27};
	//  -위에서 제시된 배열의 각 원소가 소수인지 판정해서 출력하시오.
	// Clue -배열의 순회(traverse)가 필요하다.(by using array indexing)=>반복문필요 
	//		-소수판정기준:주어진 숫자가 1로 나누어 떨어지고(나머지0)
    //		-자기자신의 숫자로도 나누어 떨어지고
    //		 -1과 자기자신을 제외한 중간숫자들로 나누어 떨어지면 안된다.
	public static void main(String[] args) {
		int[] intArray = {87, 13, 5, 99, 133, 30, 27};
			//배열 순서대로 
		for(int i=0; i<intArray.length; i++) {
			
			System.out.println(intArray[i] + " >");
				//1제외 자기자신의 숫자까지 반복
			for(int j=2; j<=intArray[i]; j++) {
				
				if(intArray[i]==j) { //자기자신은 소수라고 가정 
					System.out.println(j + "소수이다.");
				}else
					if(intArray[i]%j==0) {  //숫자로 나누어떨어졌을때 소수아 아니다
					System.out.println(j + "으로 나누어 지므로 소수가 아니다");
					break;
				} //if-else
				
			}//inner-for
		}//outer-for	
	}//main
}//end class