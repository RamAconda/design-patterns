package com.anaconda;

import com.anaconda.strategy.barking.IBarkingStrategy;
import com.anaconda.strategy.barking.LoudBarkingStrategy;
import com.anaconda.strategy.barking.SoftBarkingStrategy;
import com.anaconda.strategy.fighting.IFightingStrategy;
import com.anaconda.strategy.fighting.NoFightingStrategy;
import com.anaconda.strategy.fighting.StronglyFightingStrategy;
import com.anaconda.strategy.fighting.WeaklyFightingStrategy;

public class DogFactory {
	public static Dog createPullDog() {
		//create dog types
		IFightingStrategy fightingStrategy = new StronglyFightingStrategy();
		IBarkingStrategy barkingStrategy = new LoudBarkingStrategy();
		return new Dog(fightingStrategy , barkingStrategy);
	}
	
	public static Dog createBlackJakDog() {
		IFightingStrategy fightingStrategy = new WeaklyFightingStrategy();
		IBarkingStrategy barkingStrategy = new LoudBarkingStrategy();
			
		return new Dog(fightingStrategy , barkingStrategy);
	}
	
	public static Dog createLoloDog() {
		IFightingStrategy fightingStrategy = new NoFightingStrategy();
		IBarkingStrategy barkingStrategy = new SoftBarkingStrategy();
			
		return new Dog(fightingStrategy , barkingStrategy);
	}
}
