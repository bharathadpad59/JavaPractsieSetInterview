package com.practise.javaBasic;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		boolean flag=true;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no to check prime or not");
		int enterValue=scn.nextInt();
		
		if(enterValue==0 || enterValue==1 ) {
			System.out.println("NOt a prime no");
			
		}else {//enterVlaue/2
			for (int i = 2; i <enterValue; i++) {
				if((enterValue%i)==0) {
					System.out.println("enterVlaue== "+enterValue+" dividedBy=="+i+" moduleovalue=="+(enterValue%i)+" "+flag);
					flag=false;
					break;
				}
			}
		}
		System.out.println(flag ? "Prime no" : "NOt aprime no");
		
		
	}
}
