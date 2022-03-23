package exception.backing;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class InsufficentBalanceException 
	extends RuntimeException {

	
	public InsufficentBalanceException(String message) {
		super(message);
	}//constructor
	
}//end class
