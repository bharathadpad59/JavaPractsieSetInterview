package com.practise.interfaceConcept;

public interface InterfaceOne {

	void test();
	
	public static void test2() {
		System.out.println("Hi this is static method from interface");
	}
	
	default void test3() {
		System.out.println("I guess this default method from interface can be overrided");
	}
}
