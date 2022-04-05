package IO.Object;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


// *** 상속과 객체의 (역)직렬화의 관계 ***
// (1) 부모클래스 Serializable -> 자식클래스가 Not-Serializable하여도 직렬/역직렬 가능 
// (2) 부모클래스 Not-Serializable -> 자식클래스만 Serializable하여도 직렬/역직렬 불가능!! 
public class Child extends Parent implements Serializable{

	
	public String field2;
	
	
	//객체의 직렬화 수행시, 아래의 메소드를 재정의하면 사용할 수 있다. 
	
	private void writeObject(ObjectOutputStream out) throws IOException{
		System.out.println("Child::writeObject invoked.");
		
		out.writeUTF(field1);
		//부모객체를 먼저수행 후 자식을 직렬 수행
		out.defaultWriteObject();
	}//writeObject
	
	private void readObjcet(ObjectInputStream in) throws IOException, ClassNotFoundException{
		System.out.println("Child::readObjcet invoked.");
		
		field1 = in.readUTF();
		in.defaultReadObject();
	}//readObjcet
}//end class
