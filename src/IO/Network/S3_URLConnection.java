package IO.Network;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class S3_URLConnection {

	public static void main(String[] args) throws IOException {
		
		log.debug("main({}) invoked.", Arrays.toString(args));
		
		String url = "https://www.kita.net/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do";
		 
		URL kita = new URL(url);
		
		// 지정된 URL에 직접 연결, 연결(터널)을 생성한 객체 
//		URLConnection urlConn = kita.openConnection();
		HttpsURLConnection urlConn = (HttpsURLConnection) kita.openConnection();
		
		// URLConnection 객체는 생성된 연결을 통해 웹 자원으로부터 다양한 컨텐츠를 얻어낼 수 있다. 
		log.info(" 1. kita: {}", kita);    			//URL 
		log.info(" 2. urlConn : {}", urlConn);		//URLConnection(HttpsURLConnection 반환)
		log.info("\t + type: {}",urlConn.getClass().getName());
		
		log.info(" 3. getAllowUserIneraction : {}", urlConn.getAllowUserInteraction());
													//사용자와의 상호작용 유무 
		log.info(" 4. getDefaultAllowUserIneraction : {}", URLConnection.getDefaultAllowUserInteraction());
													//기존사용자와의 상호작용
		log.info(" 5. getConnectTimeout : {}", urlConn.getConnectTimeout());
													//접속시도후 연결까지의 연결시간: 0 대기상태 
		log.info(" 6. getContent : {}", urlConn.getContent());
													//연결된 브라우저의 내용읽을 수 있는 입력스트림을 반환 
		log.info(" 7. getContentEncoding : {}", urlConn.getContentEncoding());
													//문자열 -> 바이트열 
		log.info(" 8. getContentLength : {}", urlConn.getContentLength());	//컨텐츠의길이
		log.info("9. getConntentType: {} ", urlConn.getContentType());		//컨텐츠의유형 
		log.info("10. getDate : {}", new Date(urlConn.getDate()));			
		log.info("11. getDefaultUseCaches: {}", urlConn.getDefaultUseCaches());	//캐시사용유무 
		log.info("12. getDoInput : {}", urlConn.getDoInput());				//입력
		log.info("13. getDoOutput : {}", urlConn.getDoOutput());			//출력 
		log.info("14. getExpiration : {}", urlConn.getExpiration());		
		log.info("15. getHeaderFileds : {}", urlConn.getHeaderFields());
		log.info("16. getIfModifiedSince : {}", urlConn.getIfModifiedSince());
		log.info("17. gerLastModified : {}", new Date(urlConn.getLastModified()));
		log.info("18. getReadTimeout : {}", urlConn.getReadTimeout());		
													//연결이후 읽을때까지의 연결시간 : 0 대기시간
		log.info("29. getURL : {}", urlConn.getURL());						// URL반환
		log.info("20. getUserCaches : {}", urlConn.getUseCaches());			//기존의 캐시사용유무 
		
	}//main
}//end class
