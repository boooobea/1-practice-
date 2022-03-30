package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


//try-with-resource
//AutoCloseable 인터페이스 구현 필수 
public class ReadExample3 {

	public static void main(String[] args)  {
		
		//1. try( 자원객체를 넣는다 ) 
		//2. close()는 컴파일러가 무조건 실행하기 때문에 기입하지 않는다. 
		//3. 자원객체는 여러개를 생성하여도 된다. ;는 구분자역할 
		//4. with-resources 와는 관계없이 try-catch실행
		//5. try-with-resources : try구문만 있어도 가능 
		//6. try-catch : 자원객체 생성에서 예외발생 가능성이 있기 때문에 수행 
		
		try {
			InputStream is = new FileInputStream("C:/temp/TTT.txt");
			InputStream is1 = new FileInputStream("C:/temp/TTT.txt");
			InputStream is2 = new FileInputStream("C:/temp/TTT.txt");
			
			try (is; is1; is2;) {
				
					while(true) { 
						
						int readbyte = is.read();	
						
						if(readbyte == -1) { 
							break;
						}//if
						
						System.out.print((char)readbyte); 
					}//while
				
				}//try-with-resources 
			
			} catch (IOException e) {
				e.printStackTrace();
		}//try-catch 
		
	}//main
}//end class
