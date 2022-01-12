package com.practise.SuperSubClass.SuperSubCallingMethods;

public class Main {
	
	public static void main(String[] args) {
		Super s1= new Sub();
		s1.run();
		System.out.println("******************************************");
		Super s2= new Super();
		s2.run();
		System.out.println("******************************************");
		Sub s3= new Sub();
		s3.run();
		
		System.out.println("***********************");
		s3.protectedMethod();
	}

}
