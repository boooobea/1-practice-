package Generic;



public class BoxingMethodExample {

	public static void main(String[] args) {
		//제네릭 정적 메소드 호출 
//		Box<Integer> box1 = Util.<Integer>boxing(100);
		Box<Integer> box1 = Util.boxing(100);
		int intvalue = box1.getT();
		
		System.out.println("box1 : " + box1);
		
//		---
		Box<String> box2 = Util.<String>boxing("홍길동");
		String strvalue = box2.getT();
		
	}//main
	
}//end class
