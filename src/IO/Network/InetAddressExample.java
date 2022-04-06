package IO.Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {

	public static void main(String[] args)  {
		
		try {
			// InetAddress 클래스의 정적메소드를 호출하여 내 PC의 IP주소를 가지고 있는 
			// InetAddress 객체 생성 
			InetAddress local = InetAddress.getLocalHost();
			//InetAddress - Name, IP 두개를 가지고 있음 
			System.out.println("내 컴퓨터 IP : " + local.getHostAddress());
			System.out.println("local -- " + local);
			
//			-- 
			//DNS서버에서 도메인명(" ")에 매핑되어있는 모든 IP주소를 가져온다.
			InetAddress[] isArr = InetAddress.getAllByName("naver.net");
			for(InetAddress remote : isArr) {
				System.out.println("www.naver.com IP주소 : " + remote.getHostAddress());
			}//enhanced for 
			
		} catch( UnknownHostException e) {
			e.printStackTrace();
		}//try-catch 
		
		
	}//main
}//end class
