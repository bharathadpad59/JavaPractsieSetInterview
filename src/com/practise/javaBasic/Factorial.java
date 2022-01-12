package com.practise.javaBasic;

public class Factorial {

	public static void main(String[] args) {
		int input=4;
		int result = 1;
		for (int i=input; i >0; i--) {
			result=result*i;
		}
		
		System.out.println(result);
	}
}
