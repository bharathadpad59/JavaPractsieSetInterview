package com.practise.abstraction;

class Bean{
	public void benaMethod() {
		System.out.println("hi bena method here");
	}
}

class SuperClass{
	private Bean b= new Bean();
	private void hello() {
		System.out.println("hi from superclass");
	}
	
	public static void hello1() {
		System.out.println("hi from superclass");
	}
	
	public void getHello() {
		this.hello();
	}
	
	public Bean getBean() {
		return this.b;
	}
}

abstract class hello{
	public void hello234() {
		System.out.println("abstract method here");
	}
	
	abstract void abstractMethod();
	
	protected void hello() {
		System.out.println("hello here proteted methdo");
	}
	
}

class SubClass extends hello{
	
	public void call() {
		System.out.println("sublcass here");
	}

	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void hello() {
		System.out.println("hello here proteted methd fromn subclass");
	}
	
	
	public void hi(int name) {
		System.out.println("int==="+name);
	}

}



public class SuperclassAndSubclass {
	public static void main(String[] args) {
		hello sub= new SubClass();
//		sub.getHello();
//		sub.getBean().benaMethod();
		sub.hello234();
		sub.hello();
//		((SubClass)sub).hi("string");
	}
	


	
}
