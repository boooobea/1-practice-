package ObjectClass;

public class Car01 {

		int gas; //필드
		
		
		//생성자(default constructor)-생성자가 없으므로 컴파일러가 자동생성함 
		
		//메소드
		void setGas(int gas) { 			// 연료주입
			this.gas = gas;
		}//setGas
		
		boolean isLetftGas() { 			// 연료의 잔량여부 
			if(gas==0){
				System.out.println("gas가 없습니다");
				return false;
			}//if
			System.out.println("gas가 있습니다.");
			return true;
		}//isLetftGas
		
		void run() { 					// 움직임 
			while(true) {		//무한루프를 만들면, 반드시 탈출조건이 있어야한다.
				if(gas>0) {
					System.out.println("달립니다.(gas잔량:" + gas + ")");
					gas -= 1;
				}else {
					System.out.println("멈춥니다.(gas잔량:" + gas + ")");
					return;
				}//if
			}//while
		}//run 
		
}//end class
