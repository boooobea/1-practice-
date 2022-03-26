package Generic.Wild;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
@NoArgsConstructor
public class Product<T, M> {

	private T kind; 
	private M model;
	
}//end class


//----

@NoArgsConstructor
class Tv{
	;;
}//end class