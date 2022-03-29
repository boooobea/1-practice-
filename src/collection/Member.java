package collection;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode
@AllArgsConstructor
public class Member extends Object{

	public String name;
	public int age;
	
	
	/*
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name) && (member.age ==age);
		} else {
			return false;
		}//if-else
	}//equals
	
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}//hashCode
	*/
	
	
}//end class
