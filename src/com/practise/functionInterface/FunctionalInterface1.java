package com.practise.functionInterface;

@FunctionalInterface
public interface FunctionalInterface1 {

	void fun1();
	
	 default void fun2() {
		System.out.println("this is functional interface default method");
	}
	
	static void fun3() {
		
	}
}
