package StudyPaper;

import java.util.Arrays;

public class ComputerMethod {
	//Method(매개변수-가변인자) 
	
	int sum1(int[] values) {            //매개변수-배열 
		int sum = 0;
		
//		for(int i=0; i<values.length;i++) {
//			sum+= values[i];
//		}//for-		
		for(int num : values) {
		sum = sum + num;
		}//enhanced for-인덱싱으로는 적용할 수 없다.
		
		return sum; //메소드 실행 종료 - 변수,리터럴,연산식,다른메소드 호출 가능
					//하나의 값만 가져올 수 있을때 
	}//sum1
	
	
	int sum2(int ... values) {          //가변인자(==배열) 를 만들때 사용(...)
		System.out.println("values : " + Arrays.toString(values));
		
		int sum = 0;
		
		for(int num : values) {
			sum += num;
		}//enhanced for-인덱싱으로는 적용할 수 없다.
//		for(int i=0; i<values.length; i++) {
//			sum += values[i];
//		}//for
		
		return sum;
	}//sum2
}//end class

