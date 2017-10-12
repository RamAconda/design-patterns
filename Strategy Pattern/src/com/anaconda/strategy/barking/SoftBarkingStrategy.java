package com.anaconda.strategy.barking;

public class SoftBarkingStrategy implements IBarkingStrategy{

	@Override
	public void bark() {
		System.out.println("I'm barking softly");
	}

}
