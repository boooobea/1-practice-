package IO.ReaderWriter;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("C:/temp/TTT.txt");
		
		int readCharNo;

		char[] cbuf = new char[2];
		
		String data = ""; 
		
		while(true) {
			
			readCharNo = reader.read(cbuf,0,1);
			if(readCharNo == -1) {
				break;
			}//if
			
			data += new String(cbuf,0,readCharNo);
		}//while
		
		reader.close();
	}//main
	
}//end class
