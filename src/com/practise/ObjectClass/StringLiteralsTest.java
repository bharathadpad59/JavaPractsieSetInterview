package com.practise.ObjectClass;

import java.util.Arrays;

public class StringLiteralsTest {

	public static void main(String[] args) {
		EqualsMethod e= new EqualsMethod();
		System.out.println(e.multiply(2, 4));
		
		String a= "bharat";
		String b=a;
		a="hadpad";
		String c="bharat";
		c.concat("");
		String d="bharat";
		d=d+"";
	
		
		System.out.println(a+"   "+b);//if we change a=hadpad b will remain same because of 
		//immutability concept as java has the concept of string literals
		System.out.println(a.hashCode()+"  "+b.hashCode());
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(c==d);
		
		byte bte=(byte) (200);
		int [] i=new int [] {1,2,3,4};
		System.out.println(Arrays.toString(i));
		
		System.out.println("byte======"+bte+" byteMax==="+Byte.MAX_VALUE+" bye Min=="+Byte.MIN_VALUE);
	}
	
}
