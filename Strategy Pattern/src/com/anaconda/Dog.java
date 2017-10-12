package com.anaconda;

import com.anaconda.strategy.barking.IBarkingStrategy;
import com.anaconda.strategy.fighting.IFightingStrategy;

public class Dog {
	private IFightingStrategy fightingStrategy = null;
	private IBarkingStrategy barkingStrategy = null;
	
	
	public Dog(IFightingStrategy fightingStrategy , IBarkingStrategy barkingStrategy) {
		this.fightingStrategy = fightingStrategy;
		this.barkingStrategy = barkingStrategy;
	}
	
	public void fight() {
		fightingStrategy.fight();
	}
	
	public void bark() {
		barkingStrategy.bark();
	}
}
