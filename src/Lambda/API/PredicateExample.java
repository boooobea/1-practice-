package Lambda.API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


//함수적 인터페이스(Predicate) 
/* 특정 비지니스 로직을 염두해 두고 만든 추상메소드가 아닌, 특징을 참고하자 */
public class PredicateExample {

	private static List<Student01> list = Arrays.asList( 
			new Student01("홍길동", "남자", 90),
			new Student01("김순희", "여자", 90),
			new Student01("김자바", "남자", 95),
			new Student01("박한나", "여자", 92)
			);
	
	//boolean test(T t);
	public static double avg(Predicate<Student01> predicate) {
		int count = 0, sum = 0;
		
		for(Student01 student : list) {
			if(predicate.test(student)) {			//true - false
				count++;
				sum += student.getScore();
			}//if
		}//enhanced for
		
		return (double)sum/count;
	}//avg
	
	public static void main(String[] args) {
		double maleAvg = PredicateExample.avg( t -> t.getSex().equals("남자"));
		System.out.println("남자 평균 점수: " + maleAvg);
		
		double femaleAvg = PredicateExample.avg( t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수: " + femaleAvg );
		
		
	}//main
	
}//end class
