package IO.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		
		String originalFileName = "C:/Users/Public/Pictures/jess-bailey-q10VITrVYUM-unsplash.jpg";
		String targetFileName = "C:/temp/jess-bailey-q10VITrVYUM-unsplash.jpg";
		
		try {
			FileInputStream fis = new FileInputStream(originalFileName);	//For source file
			FileOutputStream fos = new FileOutputStream(targetFileName);	//For target file
			
			try(fis;fos){
				int readByteNo;
				
				byte[] readbytes = new byte[100];		//byte[] 
				
				while( (readByteNo=fis.read(readbytes)) != -1) {	//byte[]사용하여 한번에 읽음
					fos.write(readbytes,0,readByteNo);				//한꺼번에 출력버퍼 사용 
				}//while
				
				fos.flush();
			}//try-with-resources
			
		}catch (Exception e) {
			e.printStackTrace();
//			fos.close();
//			fis.close();
		}//try-catch
		
		System.out.println("복사가 잘 되었습니다.");
	}//main
}//end class
