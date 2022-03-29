package collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;


//HashTable 
public class HashtableExample {

	public static void main(String[] args) {
	
		// HashTable : HashMap 과 내부 구현은 같으나, 차이점은 thread-safe
		Map<String, String> map = new Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
//		---
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			// 입력받기 위한 프롬프트(Prompt) 메시지 출력 
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			
			String id = scanner.nextLine();
			
			System.out.print("비밀번호: " );
			String password = scanner.nextLine();
			System.out.println();
			
			// User Authentication(사용자 인증)
			if(map.containsKey(id)) {
				
				if(map.get(id).equals(password)){
					System.out.println("로그인 되었습니다.");
					
					break;
				} else {
					System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
				}//if-else
			}else {
				System.out.println("아이디 또는 비밀번호가 존재하지 않습니다.");
			}//if-else
			
			
		}//while
	}//main
	
}//end class
