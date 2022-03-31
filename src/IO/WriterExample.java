package IO;

import java.io.FileOutputStream;
import java.io.OutputStream;

import lombok.Cleanup;


public class WriterExample {

	public static void main(String[] args) throws Exception {

		//truncate : 잘라내고 덮어씀, FileOutputStream의 생성자 확인 
		// FileOutputStream(String name)
		// FileOutputStream(String name, boolean append)
		
		@Cleanup OutputStream os = new FileOutputStream("C:/temp/TTT.txt",true);
		@Cleanup OutputStream os2 = new FileOutputStream("C:/temp/TTT.txt",true);
		
//		try(os; os2; ){
			
			byte[] data = "ABC".getBytes();	// *** 문자열 인코딩(문자열=>바이트열)
			
			for(int i=0; i<data.length; i++) {
				os.write(data[i]);
			}//for
		
			os.flush();		//***
//		} //try-with-resources
	}//main
}//end class
