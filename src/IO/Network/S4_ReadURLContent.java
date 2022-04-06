package IO.Network;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class S4_ReadURLContent {

	public static void main(String[] args) throws IOException  {
		
		log.debug("main({}) invoked.", Arrays.toString(args));
		
		//1. 지정된 URL에 대한 URL객체 생성
		String url = "https://www.kita.net/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do";
		URL kita = new URL(url);
		
		//2. URLConnection 객체를 이용하여 연결 
		URLConnection urlcon = kita.openConnection();
		
		//3. 연결된 터널을 통해 입력스트림을 사용하여 읽음
		InputStream is = urlcon.getInputStream();
//		InputStream is = kita.openStream()
		
		//4. 읽어오는 성능을 높이기 위해 성능향상 보조스트림 사용 
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		try( is; br; ){
			String line;
			
			while( (line = br.readLine()) != null) { //buffered를 사용하게되면 EOF = NULL 
				log.info(line);
			}//while
		}//try-with-resource
		
		
		
	}//main
}//end class
