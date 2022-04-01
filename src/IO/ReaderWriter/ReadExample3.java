package IO.ReaderWriter;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class ReadExample3 {

	@SuppressWarnings("unused")
	public static void main(String[] args)  {
		
		//CharSet 생성3가지 기억하기 
//		CharSet utf8 = Charset.forName("UTF-8");
		
		try {
			Reader reader = new FileReader("C:/temp/TTT.txt");
			
			try (reader;){
				
				int readCharNo;
				char[] cbuf = new char[4];
				readCharNo = reader.read(cbuf, 0, cbuf.length);
				
				System.out.println(Arrays.toString(cbuf));
			}//try-with-resources
			
		} catch (Exception e) {
			e.printStackTrace();
		}//try-catch
		
	}//main
	
}//end class
