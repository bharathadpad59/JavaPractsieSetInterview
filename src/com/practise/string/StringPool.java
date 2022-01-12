package com.practise.string;

public class StringPool {

	public static void main(String[] args) {
		String a="bharat";   // string constant pool
		String b= new String("bharat"); // non contant pool
		
		String c="hadpad";
		String d="bharat"+"";// string constant pool
		String e=new String ("bharat");
		
		String f="bharat"+c;
		String g="bharathadpad";
		
		
		System.out.println(a==b);
		System.out.println(a==d);// string constant pool duplicates not allowed
		System.out.println(a==c);
		System.out.println(b==e);
		System.out.println(f==g);
		System.out.println(f.intern()+"   "+g.hashCode());
		
	}
}
