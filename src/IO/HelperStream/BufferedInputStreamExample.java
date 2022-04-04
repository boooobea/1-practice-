package IO.HelperStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws IOException {
		
		long start = 0;
		long end = 0;
		
		//성능향상 보조스트림을 사용하지 않고, 직접 바이트 기반의 입력스트림으로 
		//읽었을때의 실행소요시간 측정 
		FileInputStream fis1 = new FileInputStream("C:/Users/viewerSetup.exe");
		
		start = System.currentTimeMillis();
			while(fis1.read() != -1 ) {	}	
			
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때 :" +(end-start) + "ms");
		fis1.close();

//		---
		
		FileInputStream fis2 = new FileInputStream("C:/Users/viewerSetup.exe");
		//성능향상보조스트림 연결 
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		start = System.currentTimeMillis();
			while(bis.read() != -1 ) {	}	
			
		end = System.currentTimeMillis();
		System.out.println("사용했을 때 :" +(end-start) + "ms");
		bis.close();
		fis2.close();
		
		
	}//main
	
}//end class
