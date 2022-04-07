package ObjectClass;

public class Car01Example {
	
	public static void main(String[] args) {
		
		Car01 myCar = new Car01();				//1.인스턴스(=객체) 생성
		
		myCar.setGas(5); 						//2.car의 setGas()메서드 호출
		
		boolean gasState = myCar.isLetftGas(); 	//3.car의 isLetftGas()메소드 호출 
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();						//4.car의 run() 메소드 호출 
		}//if
		
		if(myCar.isLetftGas()) { 				//5. car의 isLetftGas()메소드 호출 
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요");
		}//if
		
		
	}//main
	
}//end class
