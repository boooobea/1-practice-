package IO.File;

import java.io.File;
import java.io.FileWriter;

public class FileWriteExample {

	public static void main(String[] args) {
		
		try {
			File file = new File("C:/temp/TTT.txt");
			
			FileWriter fw = new FileWriter(file,true);
			
			try(fw;){ 
				fw.write("FileWriter는 한글로된 " + "\r\n");
				fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
				
				fw.flush();
			}//try-with-resources
			
		} catch ( Exception e) {
			e.printStackTrace();
		}//try-catch 
		
//		fw.close();
		
		System.out.println("파일에 저장되었습니다. ");
	}//main
}//end class
