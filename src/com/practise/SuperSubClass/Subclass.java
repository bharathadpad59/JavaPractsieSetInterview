package com.practise.SuperSubClass;

class Subclass extends SupSubClass{
	public Subclass() {
		System.out.println("subclass");
	}
	
	@Override
	public void display() {
		System.out.println("display of subclass");
	}
	
}