package collection.properties;

import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		
		// 1. properties 객체 생성 
		Properties properties = new Properties();
		
		
		// 2. 지정된 properties 파일을 로딩(loading)하여, 
		// 1에서 생성한 properties map 객체로 저장 
		
		String path = PropertiesExample.class.getResource("Sample.properties").getPath();
		//getResource() : 파일을 읽어 URL로 되돌려준다.
		//getPath() : URL의 경로를 되돌려준다. 
		
		path = URLDecoder.decode(path, "utf-8");
		
		properties.load(new FileReader(path)); // 로딩 및 Map에 저장 
		//FileReader() : 파일을 읽음(객체) 
		
		
		// 3. properties 맵 객체에 저장된 개별 속성(property)를 사용 
		// 이때, properties에 있는 getProperty(속성명) 
		//getProperty() : 키, 값을 String으로 불러온다. 
		String value1 = properties.getProperty("option1");
		String value2 = properties.getProperty("option2");
		String value3 = properties.getProperty("option3");
		String value4 = properties.getProperty("key");
		
		
		//4. 얻어낸 각 속성값을 출력 
		System.out.println("option1: "+value1);
		System.out.println("option2: "+value2);
		System.out.println("option3: "+value3);
		System.out.println("key: "+value4);
		
		
	}//main
		
}//end class
