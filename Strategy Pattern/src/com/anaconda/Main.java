package com.anaconda;

public class Main {
	public static void main(String[] args) {
		System.out.println("\nI'm a Pull Dog\n");
		Dog dog = DogFactory.createPullDog();
		dog.fight();
		dog.bark();

		System.out.println("\nI'm a BlackJak Dog\n");
		dog = DogFactory.createBlackJakDog();
		dog.fight();
		dog.bark();

		
		System.out.println("\nI'm a Lolo Dog\n");
		dog = DogFactory.createLoloDog();
		dog.fight();
		dog.bark();
		
	}
}
