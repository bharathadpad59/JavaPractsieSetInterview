package com.practise.singelton.javaTechiee;

public class DoubleCheckingLazySingleton {

	private DoubleCheckingLazySingleton() {
	}

	private static DoubleCheckingLazySingleton instance;

	public static DoubleCheckingLazySingleton getInstance() {
		if (instance == null) {
			//in MultiThread Env 2 threads parelly came and will operate on this schronized
			// later 3rd and 4th will not obtain any lock as the outer condition will be enough 
			// to return for them
			synchronized (DoubleCheckingLazySingleton.class) {
				//1st thread came created object and release lock then 2nd thread came 
				// and check condition will not create thread at all
				// so other threads will never reach till here
				if (instance == null) {
					instance = new DoubleCheckingLazySingleton();
				}
			}

		}
		return instance;
	}
}