package IO.System;

import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws Exception {
//		System.in 		// InputStream 
//		System.out 		// PrintStream 
//		System.err     	// PrintStream
		
		System.out.println("표준출력");
		System.err.println("표준에러");
		
		int keycode = System.in.read(); 	//throws예외발생 
		System.out.println("keycode:"+keycode);
	}//main
}//end class
