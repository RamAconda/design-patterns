package com.anaconda.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.anaconda.observable.Facebook;
import com.anaconda.observer.IObserver;
import com.anaconda.observer.User;

public class Application {
	public static void main(String[] args) {
		Facebook facebook = new Facebook();
		
		IObserver user1 = new User("Mohamed");
		IObserver user2 = new User("Gamal");
		IObserver user3 = new User("Hosny");
		IObserver user4 = new User("Fatma");
		
		facebook.add(user1);
		facebook.add(user2);
		facebook.add(user3);
		facebook.add(user4);
		
		ArrayList<User> users = new ArrayList<>();
		users.add((User)user1);
		users.add((User)user2);
		users.add((User)user3);
		users.add((User)user4);
		
		
		Scanner in = new Scanner(System.in);
		for(int i =0 ; i< users.size() ; i++) {
			facebook.chat(users.get(i).getUserName() , in.nextLine());
		}
		
		in.close();
		
	}
}
