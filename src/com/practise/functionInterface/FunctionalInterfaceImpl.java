package com.practise.functionInterface;

public class FunctionalInterfaceImpl {

	static FunctionalInterface1 funInterface=()-> System.out.println("This is functional interface");
	
	
	public static void main(String[] args) {
		funInterface.fun1();
		funInterface.fun2();
	}
}
