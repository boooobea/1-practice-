package Inheritance;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Animal_cat extends Animal{
	
	@Override
	public void sound() {
		System.out.println("Cat::sound() invoked.");
		System.out.println("야옹");
	}//sound
	 
	
}//end dog
