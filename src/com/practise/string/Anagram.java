package com.practise.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String a="GRAB";
		String b="BRAG";
		
		a.toLowerCase();
		b.toLowerCase();
		
		char[] ch1=a.toCharArray();
		char[] ch2=b.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Anagram");
		}
		
	}
}
