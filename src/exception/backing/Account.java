package exception.backing;

import lombok.Getter;
import lombok.Setter;

public class Account { //계좌
	//고유속성 
	String owner; 		//예금주
	String number;		//계좌번호
	String bank;		//예금은행
	
	//상태
	@Getter @Setter int balance = 0; 		//잔고
	boolean Vaild = true;	//유효성
	
	
	public Account(String owner,String number,String bank){
		this.owner = owner;
		this.number = number;
		this.bank = bank;
	}//constructor
	

	
	boolean deposit(int money) { 	//입금
		balance += money;
		return (balance > 0 )? true : false;
				
	}//deposit
	
	boolean withdraw(int money) {	//출금
		balance -= money;
		return (balance > 0 )? true : false;
		
	}//withdraw
	
	boolean isVaild() {			//get-boolean 
		
		return true;
	}//isVaild
	
	
	
	
}//end class
