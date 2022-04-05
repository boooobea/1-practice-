package IO.Object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		
		/* 객체의 직렬화를 통한 객체 출력 */
		
		//1. 지정된 파일에 객체를 저장하기 위한 바이트 기반의 파일출력스트림 생성
		FileOutputStream fos = new FileOutputStream("C:/temp/Object.dat");
		
		//2. 파일출력스트림 -> 객체출력보조스트림 연결 
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//3. 다양한 참조타입의 객체를 출력 
		// 내부적으로 객체의 "직렬화"가 발생, 출력할 객체를 찍어낸 클래스는 
		// 기본적으로 Serializable 태그 인터페이스를 반드시 implements 해야한다. 
		oos.writeObject(10);					//Integer
		oos.writeObject(3.14);					//Double
		oos.writeObject(new int[] {1, 2, 3});	//int[]
		oos.writeObject(new String("홍길동"));	//String
		
		
		//4. 강제 flush 
		oos.flush();
		
		//5. 자원해제(보조->기본순서)
		oos.close();
		fos.close();

//		---
		
//		/* 객체의 역직렬화를 통한 객체 입력 */
//		
		//1. 여러참조타입객체를 저장한 파일에 대한 바이트기반의 파일입력스트림 생성
//		FileInputStream fis = new FileInputStream("C:/temp/Object.dat");
//		
//		//2. 객체입력보조스트림 생성 
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		
//		//3. 객체입력보조스트림의 readObject()메소드로 파일에 쓴 순서대로 객체을 읽음
//		// ** 파일에 저장된 객체의 "역직렬화(De-Serialization)" 수행 
//		// 객체를 읽는 JVM메소드 영역에, 해당참조타입의 클래스(clazz객체)가 있어야하고, 
//		// 파일에 객체를 저장할 때 사용된 클래스와 현재 파일로부터 객체를
//		// 읽어드릴때 사용하는 클래스가 같아야한다. 
//		// ** 클래스의 SerialVersionUID 필드의 값으로 판단 
//		
//		Integer obj1 = (Integer)ois.readObject();
//		Double obj2 = (Double)ois.readObject();
//		int[] obj3 = (int[])ois.readObject();
//		String obj4 = (String)ois.readObject();
//		
//		//4. 자원해제 
//		ois.close(); fis.close();
//		
//		//5. 역직렬화를 통해, 파일로부터 복원되었는지 확인하기 위해 출력 
//		System.out.println(obj1);
//		System.out.println(obj2);
//		System.out.println(Arrays.toString(obj3));
//		System.out.println(obj4);
		
	
	}//main
}//end class
