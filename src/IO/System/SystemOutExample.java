package IO.System;

import java.io.OutputStream;

public class SystemOutExample {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = System.out;		//다형성-1
		
		for(byte b=48; b<59; b+=2) { 		//아스키코드 0~9(48~57) 
			
			os.write(b);
		}//for
						// CR : Carriage Return(13)
		os.write(10);	// LF : Line Feed(10)
		os.flush();
		
//		os.close(); 	// 운영체제(System)의 자원은 닫지 않는다-프로그램종료 
//		---

		for(byte b=97; b<123; b++) {
			os.write(b);
		}//for 
		
		os.write(10);
		
//		---
		
		String hangle = "가나다라마바사아자차카타파하";
		
		byte[] hangleBytes = hangle.getBytes("utf8");
		
		os.write(hangleBytes);
		
		os.flush();
		
		
	}//main
	
}//end class
