package Lambda.API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample {

	//1. 여러 요소를 목록으로 보관하는 타입 : List
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권",95, 93)
			);
	
	// Function 인터페이스 목적 : 매핑(A->B)
	public static void printString(Function<Student, String> function) {
//									R apply(T t);
		for(Student student : list) {
			System.out.print(function.apply(student) + " ");
		}//enhanced for
	}//printString
	
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.println(function.applyAsInt(student) + " ");
		}//enhanced for
	}//printInt
	
	
	public static void main(String[] args) {
		
		System.out.println("[학생 이름]");
			FunctionExample.printString ( t-> t.getName());
			//람다식으로 익명구현객체 생성하여 전달(전달인자) 
		
			
		System.out.println("[영어 점수]");
//									int applyAsInt(T value);	
		FunctionExample.printInt( t-> t.getEnglishScore());
		
		
		System.out.println("[수학 점수]");
		FunctionExample.printInt( t-> t.getMathScore());
		
		
//		--- 아래와 같다. 
		
		ToIntFunction<Student> mapping;
		mapping = v -> v.getMathScore();
		
		
		for(Student s : list) {
			System.out.println(s.getMathScore());
		}//enhanced for
		
		
		
	}//main
}//end class
