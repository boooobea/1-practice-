package IO.Object;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {

	public static void main(String[] args) throws Exception {
		
		//1.파일에 대한 출력스트림 생성
		FileOutputStream fos = new FileOutputStream("C:/temp/Object.dat");
		
		//2.객체를 파일에 출력하기 위한, 객체출력보조스트림 생성
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//3.직렬화할 객체를 생성, 필드값을 초기화 
		ClassA classA = new ClassA();
		classA.field1 =1;
		classA.field2.field1 = 2; 		//부품관계의 필드도 같이 따라서 직렬화
		
		/* 객체를 생성하여 static 변수를 초기화하여도 
		 * static 변수는 힙메모리에 없고 매소드 메모리의 clazz객체에 들어있기 때문에 
		 * 초기화가 되지 않는다. */
		ClassA.field3 = 3;				//**정적필드는 직렬화에서 제외**
		classA.field4 = 4;				//**transient 필드도 직렬화에서 제외**
		
		System.out.println("**"+ classA);
		System.out.println("**1 :"+ classA.field3);
		System.out.println("**2 :"+ ClassA.field3);
		
		//4. 파일에 객체를 출력(직렬화발생)
		oos.writeObject(classA);
		
		//5. 자원정리 
		oos.flush();
		
		oos.close();
		fos.close();
		
	}//main
}//end class
