package IO.HelperStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputExample {

	public static void main(String[] args) throws IOException {
		
		//@Cleanup : 자원해제 닫는 순서지정이 없기때문에 try-with-resources사용이 좋다 
		FileOutputStream fos = new FileOutputStream("C:/temp/primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);	
		dos.flush();
		//근간이 되는 스트림과 보조스트림을 자원해제할 때에는 순서대로 한다.
		//(1)보조스트림 해제 (2)근간스트림 해제 
		dos.close();
		fos.close();
		
//		---
		//출력순서대로 읽어야 데이터가 섞이지 않음(파일의 시작부터 끝 순서로 읽음) 
		
		FileInputStream fis = new FileInputStream("C:/temp/primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			
			System.out.println(name + ": " + score + " : " +order);
		}//for
		
		dis.close();
		fis.close();
	}//main
}//end class
