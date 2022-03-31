package IO;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class ReadExample6 {

	public static void main(String[] args) throws Exception {
		
		
		InputStream is = new FileInputStream("C:/temp/TTT.txt");
		
		byte[] readBytes = new byte[8]; // byte[] 
		
		is.read(readBytes,0,readBytes.length); 	// byte[], off, leng - 원하는길이만큼 읽음 
		
		System.out.println(Arrays.toString(readBytes));
		
		
//		for(int i=0; i<readBytes.length; i++) {
//			System.out.println(readBytes[i]);
//		}//classical for 
		
		is.close(); //자원해제 
		
		
	}//main
	
}//end class
