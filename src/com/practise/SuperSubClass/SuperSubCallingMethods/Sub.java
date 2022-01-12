package com.practise.SuperSubClass.SuperSubCallingMethods;

public class Sub extends Super {

	public void run() {
		System.out.println("Subclass run method......");
		super.run();
	}
	
	public void walk() {
		System.out.println("Subclass walk method......");
		super.walk();
	}
	
	@Override
	public void protectedMethod() {
		
		super.protectedMethod();
		System.out.println("prptceted method can be refuced to public");
	}
	
	
//	@Override        this gives error
//	private void publicMethod() {
//		// TODO Auto-generated method stub
//		super.publicMethod();
//	}
}
