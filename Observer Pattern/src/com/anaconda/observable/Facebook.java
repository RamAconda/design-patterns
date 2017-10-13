package com.anaconda.observable;

import java.util.ArrayList;

import com.anaconda.observer.IObserver;

public class Facebook implements IObservable{
	private ArrayList<IObserver> observers = null;

	@Override
	public void add(IObserver observer) {
		if(observers == null)
			observers = new ArrayList<IObserver>();
		observers.add(observer);
	}

	@Override
	public void remove(IObserver observer) {
		if(observers != null)
			observers.remove(observer);
		
	}

	@Override
	public void notifyObserver(String userName , String message) {
		for(IObserver observer : observers) {
			observer.update(userName, message);
		}
		
	}
	
	public void chat(String userName , String message) {
		this.notifyObserver(userName , message);
	}
	
	

}
