package IO.Network;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class S2_URL {

	public static void main(String[] args) throws IOException, URISyntaxException  {
		
		log.debug("main({}) invoked.", Arrays.toString(args));
		
//		---
		//URL = Uniform Resource Locator 
		//URI = Uniform Resource Indicator
		URL url1 = new URL("https://www.kita.net/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do");
		log.info("1. url1 :{}, type : {}", url1, url1.getClass().getName());
		
//		---
		
		URL url2 = new URL("http","www.kita.net","cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do");
		log.info("2. url2 :{}", url2);
		
		URL url3 = new URL("http","www.kita.net",80,"cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do");
		log.info("3. url3 : {}", url3);
		
//		---
		
		URL kita = new URL("https://www.kita.net/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do");
		log.info("4. kita : {}", kita);
		
		log.info("\t + getAuthority : {}", kita.getAuthority());  	//인가.권한 
		log.info("\t + getProtocol :{}", kita.getProtocol());		//통신규약(http  or https)
		log.info("\t + getHost :{}", kita.getHost());				//host, 도메인이름
		log.info("\t + getPort: {}", kita.getPort());				//port : 유효한 값이 없을시 -1 
		log.info("\t + getDefalutPort:{}", kita.getDefaultPort());	//DefaultPort : https일경우 443, http일경우 80 
		log.info("\t + getFile:{}", kita.getFile());				//연결된URI
		log.info("\t + getPath : {}", kita.getPath());				//연결된URI
		log.info("\t + getQuery:{}", kita.getQuery());				
		log.info("\t + getRef : {}", kita.getRef());
		log.info("\t + getUserInfo: {}", kita.getUserInfo());
		log.info("\t + getContent: {}", kita.getContent());			//URL의 객체주소
		log.info("\t + toExternalForm : {}", kita.toExternalForm());//외부양식으로 변경해서 출력(Form change)  
		log.info("\t + toURI : {}", kita.toURI());					//URI로 변경해서 출력 
				
		
		
		
		
		
		
	}//main
}//end class
