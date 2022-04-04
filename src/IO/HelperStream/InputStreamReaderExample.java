package IO.HelperStream;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//1. 문자변환 보조스트림 : InputStream -> Reader 변환
// 보조스트림 생성자에 근간스트림 연결 
public class InputStreamReaderExample {

	public static void main(String[] args) throws Exception {
		
		InputStream is = System.in;
		
		Reader reader = new InputStreamReader(is);
		
		int readCharNo;
		char[] cbuf = new char[100];
		while ( (readCharNo = reader.read(cbuf)) != -1) {
			String data = new String(cbuf,0,readCharNo);
			
			System.out.println(data);
		}//while 
		
		reader.close();
	}//main
}//end class
