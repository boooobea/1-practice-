package IO.Network;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class S5_ReadURLConnectAndSaveToFile {

	public static void main(String[] args) throws IOException {
		
		log.debug("main({}) invoked.", Arrays.toString(args));
		
		String url = "https://www.kita.net/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do";
		String outFile = "goodMornkitaDetail.do.html";
		
		URL kita = new URL(url);
		
		InputStream is = kita.openStream();
		FileOutputStream fos = new FileOutputStream(outFile);
		
		try( is; fos; ){
			int nextByte; 
			 
			while( (nextByte=is.read()) != -1) {
				fos.write(nextByte);
			}//while
		}//try-with-resource
		
//		---
		
		File f = new File(outFile);
		
		if(f.exists()) {
			log.info("\t + getAbsolutePath : {}", f.getAbsoluteFile());
		}//if
		
		
		
	}//main
}//end class
