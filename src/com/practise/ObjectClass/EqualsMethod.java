package com.practise.ObjectClass;

public class EqualsMethod {

	public static void main(String[] args) {
		Object o1= new Object(); 
		Object o2 = new Object();
		Object o3=o1;
		
		System.out.println("hashcode object-1=="+o1.hashCode()+" hashcode object-2="+o2.hashCode()+
				"hashcode object-3=="+o3.hashCode());
		System.out.println(o1.equals(o2)+" comparisonOperator o1==o2=== "+(o1==o2)+" o1==o3 "+(o1==o3) );
		System.out.println("o1.equals(o3)== compares hashcode in Object case==="+o1.equals(o3));
	}
	
	private int sum(int a, int b ) {
		return (a+b);
	}
	
	public int multiply(int a, int b ) {
		return (a*b);
	}

}
