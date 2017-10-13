package com.anaconda.observer;

public class User implements IObserver{

	private String userName = null;
	
	public User(String userName ) {
		this.userName = userName;
	}
	
	@Override
	public void update(String userName, String message) {
		System.out.println(userName + "\tsays\t" + message);
	}
	
	

	public String getUserName() {
		if(userName == null) return "";
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
