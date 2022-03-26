package Generic.Wild;


public class Course<T> {		//학원의 모든 과정을 대표하는 클래스

	private String name;		// 과정명
	private T[] students;		// 수강생(재직자, 학생, 고등학생) 
								// 필드의 타입이 배열인데 T타입의 배열임 
	
	public Course(String name, int capacity) {
		this.name = name;
		
		/* 제네릭 타입파라미터 배열 생성은 아래와 같다. 
		 * 2단계로 배열 생성한다. 
		 * 1) 우선, Object 타입의 원소를 가지는 배열을 생성 
		 * 2) 강제형변환을 통해서, 배열의 원소가 T인 배열로 변환 */
//		students = new T[]; // XX 
		students = (T[])(new Object[capacity]);
	}//constructor
	
	
	public String getName() { return name; }		//getter
	public T[] getStudents() { return students; }	//getter
	
	
	public void add(T t) {		//수강생을 모집할 때 마다, 학생배열에 추가 
		for(int i=0; i<students.length; i++) {
			
			if(students[i] == null) {
				students[i] = t;
				
				break;
			}//if
		}//for
	}//add
	
}//end class
