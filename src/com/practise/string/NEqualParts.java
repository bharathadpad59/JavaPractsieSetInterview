package com.practise.string;

public class NEqualParts {

	public static void main(String[] args) {
		String str1="abchsnstdhjdfgv";
		int n=3;
		for (int i = 0; i < str1.length(); i=i+n) {
			System.out.println(str1.substring(i,i+n));
		}
	}
}
