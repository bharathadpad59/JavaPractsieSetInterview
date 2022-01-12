package com.practise.singelton.javaTechiee;

import java.io.Serializable;

//WE can break the singleton pattern in 3 ways

//1. By Serializationa and deseralization
//2. By cloning clone() method
//3. By Reflection Api by calling  LazySingleton.class.getDeclaredConstructors(.setAccessible(true))


//Avoid Above breaks with below Solution

//1. By readResolve() method which will be called while desearlization, so here we can just return
//existing instance which already created.

//2. by overide clone() method in singleton class and throwing error in that.
//3. by checking in Private Constructor whether the object is  not null then throw exedcption.


public class LazySingleton extends MyClone implements Serializable {

	private static LazySingleton instance;

	private LazySingleton() {
		if (instance != null) {
			throw new IllegalStateException("object can't be create using reflection");
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	//while desearalization this method will be called so we can send the instance from here
	//which will not create new object
	protected Object readResolve() {
		return instance;
	}

	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			return instance = new LazySingleton();
		} else {
			return instance;
		}
	}

}