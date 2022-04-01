package IO.ReaderWriter;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) throws IOException {

		Reader reader = new FileReader("C:/temp/TTT.txt");
		
		int readData;
		
		while(true) {
			readData = reader.read(); //문자(char-2byte)를 읽어옴 
			
			if(readData == -1) {
				break;
			} //if
			System.out.print((char)readData);
		
		}//while 
		
		reader.close();
		
	}//main
	
}//end class
