package ObjectClass;

public class Calculator {

	
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	} //poweron
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}//puls
	
	double divide(int x, int y) {
		double result = (double)x /y; 
		//피연산자 한쪽이 double형변환 되어 남은피연산자를 자동 형변환
		return result;
	}//divide
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}//end class
