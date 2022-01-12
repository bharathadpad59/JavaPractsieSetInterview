package com.practise.exeception;

public class ExceptionPractical {
//Unreachable catch block for ArithmeticException. 
//It is already handled by the catch block for Exception
	public static void main(String[] args) {
		try {
			int a=0;
			a=a/10;
			
		} catch (Exception e) {
		}
		catch (ArithmeticException e) {
			
		}
	}
}
