package com.practise.tryCatch;

public class TryCatch {

	public static void main(String[] args) {
		try {
//			int i=10/0;
			System.out.println("try block");
			return;
		} catch(Exception e){
			System.out.println("catch block");
			return;
		}
		finally {
			System.out.println("finally block");
			
			}
			
	}
	//if you write return statement in try block will the control goes to finaaly ?
	//Ans: yes it always goes irrespective of the return stmnt and exception occurs
	
}
