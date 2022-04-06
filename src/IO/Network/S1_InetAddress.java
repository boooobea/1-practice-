package IO.Network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.channels.UnsupportedAddressTypeException;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class S1_InetAddress {

	public static void main(String[] args) throws UnknownHostException {
		
		log.debug("main({}) invoked.", Arrays.toString(args));
		
//		--
		
		InetAddress localhost = InetAddress.getLocalHost();
		log.info("0. lolcaHost : {}, type : {}", localhost, localhost.getClass());
		
//		--
		//IP주소-호스트명의 정보를 가지고있음 
		InetAddress addr = InetAddress.getByName("www.naver.com");
		
		log.info("1. addr : {}", addr);
		log.info("2. hostname : {}", addr.getHostName());
		log.info("3. FQDN : {}", addr.getCanonicalHostName()); 		//완전한 도메인명 
		log.info("4. hostAddress : {}", addr.getHostAddress());		
		log.info("5. loopback : {}", InetAddress.getLoopbackAddress());		//127.0.0.1 
		log.info("6. localhost : {}", InetAddress.getLocalHost());		//나의PC 
		
//		---
		
		//IP주소 -> byte[] 변환 : IP주소 분할 얻어냄 
		byte[] addrBytes = addr.getAddress();
		log.info("7. byteAddr : {}", Arrays.toString(addrBytes));
		
		//byte < 0 ? b+256 : b
		for( byte b : addrBytes) {
			log.info("\t + b: {}", (b < 0) ? b+256 : b);
		}//enhanced for
		
//		---
		
		InetAddress[] addrs = InetAddress.getAllByName("www.kakao.com");
		
		for(InetAddress address : addrs) {
			log.info("8. address : {}", address);
			log.info("9. FQDN : {}", address.getCanonicalHostName());
		}//enhanced for 
		
		
	}//main
}//end class
