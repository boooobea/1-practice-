package IO.File;

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args)  {
		
		try {
//			@Cleanup
			FileReader fr =
					new FileReader("C:/temp/TTT.txt");
			
			try(fr;){
			
				int readCharNo;
				
				char[] cbuf = new char[100];		//byte[] -> char[] 
				
				while( (readCharNo=fr.read(cbuf)) != -1) {
					String data = new String(cbuf, 0, readCharNo);
					
					System.out.print(data);
				}//while
			}//try-with-resource
			
		} catch( Exception e) {
			e.printStackTrace();
		}//try-catch
	}//main
}//end class
