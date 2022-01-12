package com.practise.singelton;

public class Singleton {

	static Singleton sinletonInstance = null;

	private Singleton() {
		System.out.println("singleton class");
	}

	public static Singleton getInstance() {
		if (sinletonInstance != null)
			return sinletonInstance;
		else {
			sinletonInstance = new Singleton();
			return sinletonInstance;
		}
	}

}
