package IO.File;

import java.io.File;
import java.net.URI;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileExample {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:/temp/Dir");
		File file1 = new File("C:/temp/file1.txt");
		File file2 = new File("C:/temp/file2.txt");
		File file3 = new File(new URI("file:///C:/temp/file3.txt"));
								//URI("file:/// ") - 자원 지시자 객체 
		System.out.println("1. dir" + dir);
		System.out.println("2. file1 " + file1);
		
//		---
		
		if(dir.exists()==false) { dir.mkdirs(); }
		if(file1.exists() == false) { file1.createNewFile(); }
		if(file2.exists() == false) { file2.createNewFile(); }
		if(file3.exists() == false) { file3.createNewFile(); }
		
//		--
		
		File temp = new File("C:/temp"); //file객체 생성, reculceve 하지 않는다.(깊게 들어가지않음)
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd   a   HH:mm"); //a오전 b오후 
		System.out.println("1. sdf :" + sdf);
		
		File[] contents = temp.listFiles(); //file리스트 생성-> 파일배열생성 
		
		System.out.println("날짜    시간    형태   크기  이름");
		System.out.println("----------------");
		for(File file : contents){
			System.out.println(sdf.format(new Date(file.lastModified())));
			// date 객체생성 (file.lastModified() : 파일.마지막 수정시간)
			
			
			if(file.isDirectory()) {
				System.out.println("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
			}//if-else
			
		}//enhanced for 
		
		
	}//main
}//end class
