package com.anaconda.observable;

import com.anaconda.observer.IObserver;

public interface IObservable {
	public void add(IObserver observer);
	public void remove(IObserver observer);
	public void notifyObserver(String userName , String message);
}
