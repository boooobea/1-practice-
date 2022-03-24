package Generic;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//Generic class 
@ToString
@Getter
@Setter
@NoArgsConstructor
public class Box<T> {

	private T t;
	
//	public T get() { return t;}			//get
//	public void set(T t) { this.t = t; }//set
	
}//end class
