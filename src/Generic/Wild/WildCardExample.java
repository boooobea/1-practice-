package Generic.Wild;
import java.util.Arrays;


public class WildCardExample {

	//모든 사람이 들을 수 있는 일반인 과정 등록 메소드 
	public static void registerCourse(Course<?> course) {
//		 --> Course<?> course = new Course<Person>("일반인과정", 5);
		
		System.out.println(course.getName() + "수강생" + 
							Arrays.toString(course.getStudents()));
	}//registerCourse
	

	//학생만을 대상으로 하는 학생과정 등록 메소드
	public static void registerCourseStudent(Course<? extends Student> course) {
												//Upper Bounded WildCards
		System.out.println(course.getName() +"수강생" + 
							Arrays.toString(course.getStudents()));
	}//registerCourseStudent
	
	
	//재직자를 대상으로 하는 등록 메소드 
	public static void registerCourseWorker(Course<? super Worker> course) {
												//Lower Bounded WildCards
		System.out.println(course.getName() +"수강생" + 
							Arrays.toString(course.getStudents()));
	}//registerCourseWorker
	
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));	 		//<Person>이기 때문에 다형성으로 인해 자식타입 가능
		personCourse.add(new Student("학생"));			//다형성-1
		personCourse.add(new HighStudent("고등학생"));	//다형성-1
			
		WildCardExample.registerCourse(personCourse);				
//		WildCardExample.registerCourseStudent(personCourse);		//xx
		WildCardExample.registerCourseWorker(personCourse); 		//ok
		
//		---
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정",5);
		workerCourse.add(new Worker("직장인"));
//		
//		WildCardExample.registerCourse(workerCourse);
////		WildCardExample.registerCourseStudent(workerCourse);		//xx
//		WildCardExample.registerCourseWorker(workerCourse);			//ok
		
//		---
		
		Course<Student> studentCourse = new Course<Student>("학생과정",5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
//		
//		WildCardExample.registerCourse(studentCourse);
//		WildCardExample.registerCourseStudent(studentCourse);		//ok
////		WildCardExample.registerCourseWorker(studentCourse); 		//xx
		
//		---
		
		Course<HighStudent> highstudentCourse = new Course<HighStudent>("고등학생과정",5);
		highstudentCourse.add(new HighStudent("고등학생"));
//		
//		WildCardExample.registerCourse(highstudentCourse);
//		WildCardExample.registerCourseStudent(highstudentCourse);	//ok
////		WildCardExample.registerCourseWorker(highstudentCourse);	//xx
		
	}//main
	
}//end class
