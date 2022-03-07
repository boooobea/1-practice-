package ForSwitch;

public class EnumSample {
	public static void main(String[] args) {
//enum + switch 
		Week day = Week.FRIDAY;

// A. switch문
		String dolist = null;
		
		switch(day) {
			case MONDAY	 	:
			case TUESDAY 	:
			case WEDNESDAY 	:
			case THURSDAY 	:
			case FRIDAY 	: dolist = "오늘은공부하는날^^"; break;
			case SATURDAY 	:
			case SUNDAY 	: dolist ="오늘은복습하는날ㅠㅠ"; break;
		}//switch
		System.out.println("1. day: " + dolist);
		
//B-1 New switch : case에 다중값을 넣어 선택한 후 값을 return 
		dolist = switch(day) {
			case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->"오늘은공부하는날^^";
			case SATURDAY, SUNDAY -> "오늘은복습하는날ㅠㅠ";
		}; //switch expression
		
		System.out.println("2. day: " + dolist);
		
		
//B-2. New switch : 값을 반환하지 않고 코드를 실행 가능 
		//다중으로 넣은 값이 변경사항이 있을시 코드를 변경해야한다.
		switch(day) {
		case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> 
								{System.out.println("오늘은공부하는날^^");}
		case SATURDAY, SUNDAY ->{System.out.println("오늘은복습하는날ㅠㅠ");}
		}// switch expression 
		
		
//B-3.New switch : 복합한 논리는 중괄호{}로 감싸야하며 return값을 반환할 시 yield를 사용
		//디테일한 코드를 넣을 수 있다. 
		dolist = switch(day) {
			case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->{
				System.out.println("1. case");
				System.out.println("오늘은공부하는날^^");
				yield "Day On";
			}
			case SATURDAY, SUNDAY ->{
				System.out.println("2. case");
				System.out.println("오늘은복습하는날ㅠㅠ");
				yield "Day Off";
			}
		}; //switch expression 
		
	}//main
}//end class
