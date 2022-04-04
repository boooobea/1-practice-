package IO.File;

import java.io.File;
import java.io.FileInputStream;

import lombok.Cleanup;

public class FileInputStreamExample {

	public static void main(String[] args) {
		
		System.out.println(File.separator);
		System.out.println(File.pathSeparator);
		// path Separator(경로구분자) : 운영체제마다 다름(윈도우:\, mac/Linux/UNIX : /)
		// \\ : 경로구분자로 쓰임, \ :탈출문자로쓰임(ex:\t)
		// 모든 운영체제의 공통 경로구분자 / (호환성) 
		
	try {
		@Cleanup
		FileInputStream fis = 
			new FileInputStream("C:/app/workspace/jse/project1/src/NIO/ScannerFile/FileInputStreamExample.java");
			int data;
			StringBuffer sb = new StringBuffer();
			
			while( (data = fis.read()) != -1) {	 //EOF를 만날때까지 반복해서 읽음 
				
//				System.out.write(dataread,0,dataread.length);	 	//System.out : printStream <InputStream(write메소드호출)   
				sb.append((char)data);		
			}//while
			
			String sources = sb.toString();
			System.out.println(sources);
			
	} catch (Exception e) {
		e.printStackTrace();
	}//try-catch
	
	}//main
}//end class
