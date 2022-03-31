package IO;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.SortedMap;

public class ReadExample5 {

	public static void main(String[] args) throws Exception {
		
		//--------- 문자집합 생성 3가지 
		Charset ms949 = Charset.defaultCharset(); //운영체제의 문자집합 생성 
		Charset utf8 = Charset.forName("utf-8");  //문자집합의 이름을 넣으면 생성 
		Charset utf_2 = StandardCharsets.UTF_8; // StandardCharsets: Charset의 헬퍼클래스 
		
		SortedMap<String, Charset> charsets = Charset.availableCharsets(); 
		//availableCharsets() : 사용가능한 문자집합
		Set<String> keys=charsets.keySet();
//		System.out.println(keys);
		//--------- 
		
		
		InputStream is = new FileInputStream("C:/temp/TTT.txt");
		
		int readByteNo;
		String data = "";
		
		byte[] readByte = new byte[3]; // read(byte[] b) 
		
		while(true) {
			
			readByteNo = is.read(readByte); //EOF -1 이면 탈출 
			
			if(readByteNo == -1) {
				break;
			}//if
		
			data += new String(readByte, 0, readByteNo,"UTF-8");
			
			//*** String 클래스의 생성자를 확인하자 *** 
			//String(byte[] bytes, int offset, int length, String charsetName)
			//String(byte[] bytes, int offset, int length, Charset charset)
			
		}//while

		System.out.println(data);
		
		is.close(); //자원해제 
	}//main
	
}//end class
