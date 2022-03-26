package Generic.Wild;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor
public class ChildProduct<T, M, C> extends Product{

	private C company;
	
}//end class
