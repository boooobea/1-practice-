package IO;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/temp/TTT.txt");
		
		byte[] data = "ABC".getBytes("UTF-8"); //기본문자셋으로 인코딩 
							//getBytes(String charsetName)
		
		os.write(data); //출력버퍼(8KB)에 고속출력 
		
		os.flush();
		os.close();
		
		
	}//main
	
}//end class
