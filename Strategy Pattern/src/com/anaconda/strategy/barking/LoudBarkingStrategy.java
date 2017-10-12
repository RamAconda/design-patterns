package com.anaconda.strategy.barking;

public class LoudBarkingStrategy implements IBarkingStrategy{

	@Override
	public void bark() {
		System.out.println("I'm barking loudly");
	}

}
