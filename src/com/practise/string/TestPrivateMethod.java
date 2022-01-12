package com.practise.ObjectClass;

public class TestPrivateMethod {

	public static void main(String[] args) {
		EqualsMethod e= new EqualsMethod();
		System.out.println(e.multiply(2, 4));
		
		String a= "bharat";
		String b="bharat";
//		a="hadpad";
		
		System.out.println(a+"   "+b);
		System.out.println(a.hashCode()+"  "+b.hashCode());
		System.out.println(a==b);
	}
	
}
