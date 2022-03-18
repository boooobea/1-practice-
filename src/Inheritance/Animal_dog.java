package Inheritance;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Animal_dog extends Animal{
	
	@Override
	public void sound() {
		System.out.println("Dog::sound() invoked.");
		System.out.println("멍멍");
	}//sound
	
	 
	
}//end dog
