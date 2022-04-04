package IO.System;

import java.io.InputStream;

public class SystemInExample2 {

	public static void main(String[] args) throws Exception {
		
		// 영문/숫자를 입력받기 위한 배열이라면 100문자를 입력받을 수 있지만 
		// 한글은 자바언어에서 2바이트로 표현되기 때문에, 배열크기의 절반인 최대 50문자의 
		// 한글을 입력받을 수 있다.
		
		InputStream is = System.in;
		
		byte[] datas = new byte[100]; 		//byte[] 
		
		System.out.print("이름: ");			//prompt 메세지 출력 
		int nameBytes = is.read(datas);		//read(byte[]) 
		
		//최종사용자가 키보드에서 여러문자를 입력한 이후, 마지막으로 엔터키를 누르면 
		//read()메소드가 실행, 읽은 바이트 배열에 있는 키보드 값으로 
		//String 클래스의 생성자를 이용해여 문자열을 저장 후 디코딩 실행 
		String name = new String(datas, 0, nameBytes-2); // -2 : Enter키도 문자(2byte)로 간주한다.
		
		System.out.print("하고 싶은말: ");
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0, commentBytes-2);
		
		System.out.println("입력한 이름: " + name);
		System.out.println("하고 싶은말: " + comment);
		
		
	}//main
	
}//end class
