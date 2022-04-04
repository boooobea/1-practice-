package IO.HelperStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args)  {
		
		try {
			FileOutputStream fos = new FileOutputStream("C:/temp/file.txt");
			PrintStream ps = new PrintStream(fos);
			
			try(fos; ps;){
				ps.println("[프린터 보조 스트림]");
				ps.print("마치");
				ps.println("프린터가 출력하는 것처럼");
				ps.println("데이터를 출력합니다.");
				
				//(String format, Object ... args) : 포맷팅문자열, 가변인자...
				ps.printf("이름: %s,나이: %d", "bibian", 23);
				
				ps.flush();
			}//try-with-resources 
			
		} catch (Exception e) {
			e.printStackTrace();
		}//try-catch 
	}//main
}//end class
