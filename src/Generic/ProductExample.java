package Generic;



public class ProductExample {

	public static void main(String[] args) {
		//제네릭 타입 클래스의 인스턴스 생성(구체타입전달) 
		Product<Tv, String> product1 = new Product<>();
		
		product1.setKind(new Tv());				//setter
		product1.setModel("스마트Tv");			//setter
		
		Tv tv = product1.getKind();				//getter
		String tvModel = product1.getModel();	//getter
		
		System.out.println("product1: "+product1);
		
//		---
//		Product<Car, String> product2 = new Product<Car, String>();
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		System.out.println("product2:" + product2);
	}//main
	
}//end class
