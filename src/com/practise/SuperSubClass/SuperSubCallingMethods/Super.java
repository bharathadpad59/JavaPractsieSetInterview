package com.practise.SuperSubClass.SuperSubCallingMethods;

public class Super {

	public void run() {
		System.out.println("Superclass run method......");
		walk();
	}
	
	public void walk() {
		System.out.println("Superclass walk method......");
	}
	
	protected void protectedMethod() {
		System.out.println("superclass private method");
	}
	
	public void publicMethod() {
		System.out.println("publoc method of superClass");
	}
}
