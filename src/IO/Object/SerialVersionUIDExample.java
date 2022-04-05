package IO.Object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExample {

	public static void main(String[] args) throws Exception {
		
		//1.파일에 출력할 출력스트림 생성
		FileOutputStream fos = new FileOutputStream("C:/temp/Object.dat");
		

		//2. 객체출력보조스트림 생성
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//3. 직렬화할 객체 생성(Serializable) 
		ClassC classC = new ClassC();
		classC.field1 = 1;				//int타입의 인스턴스필드 초기화 
		
		//4. 객체출력
		oos.writeObject(classC);
		
		
		//5.자원해제 
		oos.flush();
		
		oos.close();
		fos.close();
	}//main
}//end class
