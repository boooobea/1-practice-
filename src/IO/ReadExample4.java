package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import lombok.Cleanup;


//@Cleanup (try-with-resources 대체) 
public class ReadExample4 {

	public static void main(String[] args)  {
		
		try {
		@Cleanup //자원객체 생성구문 위에 위치, 타겟속성이 있으며 close()실행한다. 
		InputStream is = new FileInputStream("C:/temp/TTT.txt");
				
			while(true) { 
						
				int readbyte = is.read();	
						
				if(readbyte == -1) { 
					break;
				}//if
					
				System.out.print((char)readbyte); 
			}//while
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main
}//end class
