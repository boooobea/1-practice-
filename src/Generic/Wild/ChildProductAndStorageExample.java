package Generic.Wild;

import Generic.Tv;

public class ChildProductAndStorageExample {

	public static void main(String[] args) {
		
		//제네릭 클래스를 상속받은 클래스 
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		
		product.setKind(new Tv());
		product.setModel("smartTV");
		product.setCompany("samsung");
		
//		---
		//제네릭 인터페이스를 구현한 클래스
		Storage<Tv> storage = new StorageImpl<>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
		
		System.out.println(" - storage : " + storage );
	}//main
	
}//end class
