package IO.Object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class SerialVersionUIDExample2 {

	public static void main(String[] args) throws Exception {
		
		//1. 역직렬화할 객체가 저장된 파일에 대한 입력스트림 생성
		FileInputStream fis = new FileInputStream("C:/temp/Object.dat");
		
		
		//2. 입력스트림에 객체 입력 보조스트림 연결
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		//3. 객체복원(역직렬화 수행) 
		ClassC classC = (ClassC) ois.readObject();
		System.out.println("field1 : " + classC.field1);
		System.out.println("field2 : " + classC.field2);
		
	}//main
}//end class
