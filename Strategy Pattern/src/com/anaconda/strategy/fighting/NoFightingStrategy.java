package com.anaconda.strategy.fighting;

public class NoFightingStrategy implements IFightingStrategy{

	@Override
	public void fight() {
		System.out.println("I don't fight");
	}
	
	

}
