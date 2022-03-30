package IO;

import java.io.FileInputStream;
import java.io.InputStream;


//throw Exception
public class ReadExample {

	public static void main(String[] args) throws Exception {
		//입력스트림 객체를 생성 -> 실제 타겟과 연결 
		InputStream is = new FileInputStream("C:/temp/TTT.txt");
		
//		-- 
		
		while(true) { //파일의 끝(EOF)까지 무한루프 
			int readbyte = is.read();	//read() : 1바이트를 읽음 
			
			if(readbyte == -1) { //파일의 끝(EOF: End Of File) -1 
				break;
			}//if
			
			System.out.print((char)readbyte); // byte->char(casting) 
		}//while
		
		is.close(); 
		
	}//main
	
}//end class
