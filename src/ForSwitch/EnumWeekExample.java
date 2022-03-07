package ForSwitch;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
// enum + switch의 예시
		Week day = null;

		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1: day = Week.SUNDAY;break;
			case 2: day = Week.MONDAY;break;
			case 3: day = Week.TUESDAY;break;
			case 4: day = Week.WEDNESDAY;break;
			case 5: day = Week.THURSDAY;break;
			case 6: day = Week.FRIDAY;break;
			case 7: day = Week.SATURDAY;break;
		}//switch
		System.out.println("오늘은 " + day + "입니다.");
			
		if(day==Week.SUNDAY) { 		//객체와 객체를 비교할때는 == 를 사용 
			System.out.println("일요일에는 산책하기!");
		} else {
			System.out.println("열심히공부하기!!");
		}//if-else
	}//main
}//end class
