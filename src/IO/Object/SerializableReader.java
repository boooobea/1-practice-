package IO.Object;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableReader {

	public static void main(String[] args) throws Exception {
//		System.out.println("field3 : " + ClassA.field3);
		
		//1. 객체가 저장된 파일에 대한 입력스트림 생성
		FileInputStream fis = new FileInputStream("C:/temp/Object.dat");
		
		//2. 객체입력 보조스트림 생성
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		//3. 보조스트림을 통해 파일에 저장된 객체 복원(역직렬화)
		ClassA v = (ClassA) ois.readObject();
	
		//4. 복원된 객체의 다양한 유형의 필드값 복원 확인 
		System.out.println("field1 : " + v.field1);
		System.out.println("field2.field1 : " + v.field2.field1);
		
		/* 정적필드는 복원이 아니라 clazz객체를 참조하기 때문에 값이 변동이 없다.*/
		System.out.println("field3 : " +v.field3);
		
		System.out.println("field4 : " + v.field4);
		
		ois.close();
		fis.close();
	}//main
}//end class
