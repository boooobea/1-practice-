package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


//try-catch
public class ReadExample2 {

	public static void main(String[] args)  {
		//지역변수는 선언만으로 끝내지 말고, 초기값으로 초기화해서 정의 
		InputStream is = null; //정의하여 다음 블록에서 자유롭게 해줌 
		
		try {
			is = new FileInputStream("C:/temp/TTT.txt");
			while(true) { //파일의 끝(EOF)까지 무한루프 
				int readbyte = is.read();	//read() : 1바이트를 읽음 
				
				if(readbyte == -1) { //파일의 끝(EOF: End Of File) -1 
					break;
				}//if
				
				System.out.print((char)readbyte); // byte->char(casting) 
			}//while
			
		
		} catch (IOException e) {
			e.printStackTrace(); // printStackTrace() : at 상태표시줄 출력 
			
		} finally { //try block

			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
		}//try-catch-finally
	}//main
	
}//end class
