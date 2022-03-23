package exception.backing;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Teller {
	
	
	boolean processRequest(Account source, Account target, Money trnasfermoney) 
		throws InsufficentBalanceException, InvalidAcountException {
		
		//입출금계좌 모두 유효하면
		if(source.isVaild() & target.isVaild()) { //happy path 
			int sourcebalance = source.getBalance();
			int trnasMoney = trnasfermoney.getAmount();
			
			if(sourcebalance >= trnasMoney) {	//잔고확인(happy path )
				if(source.withdraw(trnasMoney)) {//소스계좌에서 출금 성공 
					boolean isSuccese = target.deposit(trnasMoney);
					System.out.println("이체 성공");
					
					return isSuccese;
				}//if 
			
			} else {					//2. 예외를 발생(잔고가 없는경우)
				throw new InsufficentBalanceException("잔고 부족");
			}//if-else
			
			return true;
			
		} else {						//1. 예외를 발생(계좌가 유효하지 않은 경우)
			throw new InvalidAcountException("계좌 유효하지 않음");
		}//if-else 
		
	}//processRequest
	
}//end class
