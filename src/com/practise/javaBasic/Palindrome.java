package com.practise.javaBasic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		String a="MADAM";
		int a=515;
		
		StringBuilder stb= new StringBuilder();
		String input=a+"";
		for (int i =  input.length()-1; i >=0; i--) {
			stb.append(input.charAt(i));
		}
		if(stb.toString().equals(input)) {
			System.out.println("Palindrome=== reversone=="+stb+" original=="+a);
		}
		
	}
}
