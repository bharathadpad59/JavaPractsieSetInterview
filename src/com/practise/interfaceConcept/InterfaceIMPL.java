package com.practise.interfaceConcept;

public class InterfaceIMPL implements InterfaceOne {

	@Override
	public void test() {

	}
	
	@Override
	public void test3() {
		InterfaceOne.super.test3();
		System.out.println("interface default method can be overrided");
	}

	public static void main(String[] args) {
		InterfaceOne ione= new InterfaceIMPL();
		ione.test3();
	}
}
