package com.practise.singelton.javaTechiee;

//Best way to create any Singleton class as this is thread safe
// Until first call is not gone to getInstance() method,  the inner class is not at all loaded.

public class LazzyInnerClassSingleton {

	private LazzyInnerClassSingleton() {

	}

	private static class SingletonHelper {
		private static final LazzyInnerClassSingleton instance = new LazzyInnerClassSingleton();
	}

	public static LazzyInnerClassSingleton getInstance() {
		return SingletonHelper.instance;
	}

}