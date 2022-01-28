package com.practise.string;

public class StringTesting {
	public static void main(String[] args) {
		String a="bharat";
		String b=new String("bharat");
		String c= new String("bharat");
		
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==b.intern());
		
		
		for (int i = 0; i=5; i++) {
			for (int j = 0; j < 8; j++) {
				if (j==1) {
					System.out.println("j got 2");
					break;
				}

			}
			System.out.println("the i value it reaches");
		}
		
		
		
	}
	

}
