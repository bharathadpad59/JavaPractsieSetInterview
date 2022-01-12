package com.practise.abstraction;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Palindrome {

	public static void main(String[] args) {
		String a="madamm";
		char [] charOfStringA=a.toCharArray();
		
		StringBuilder stb=new StringBuilder();
		for (int i = a.length()-1; i >=0 ; i--) {
			stb.append(a.charAt(i));
		}
		System.out.println("GIven String is="+a+" and its"+(a.equals(stb.toString())?" palindrome":" Not a palindrome"));
	}
}
