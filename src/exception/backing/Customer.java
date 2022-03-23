package exception.backing;


public class Customer {
	
	String name;
	String ssn;
	
	void requestTransfer() {
		Teller teller = new Teller();
		
		Account sourceAccount = new Account("bibian", "1-2-3","back1");
		sourceAccount.setBalance(5000000);
		
		Account targetAccount = new Account("sister", "111-222","back2");
		targetAccount.setBalance(0);
		
		Money transferMoney = new Money(1000000);
		
		try {
		boolean isSuccese = teller.processRequest(sourceAccount, targetAccount, transferMoney);
			if(isSuccese) {//이체성공 
				System.out.println("이체가 성공되서 돈 보냈당");
			}//if 
		} catch(InsufficentBalanceException | InvalidAcountException e) {
			System.out.println("이체가 안된당......");
			
			e.printStackTrace();
			//prinStackTrace():예외의 정보를 출력해서 보여줌 
		}//try-catch
	}//requestTransfer
	
}//end class
