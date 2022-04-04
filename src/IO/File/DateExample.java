package IO.File;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date now = new Date(); 	//Date 객체 생성
		System.out.println("1. now: "+ now);
		
		
		//2022-04-04 - 10:41:20 
		String pattern = "yyyy/MM/dd - HH:mm:ss.SSS";	// 패턴 지정
		DateFormat df = new SimpleDateFormat(pattern); 	//DateFormat - SimpleDateFormat()
		
		System.out.println(df.format(now)); 
		
	}//main
}//end class
