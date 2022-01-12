package com.practise.abstraction;

public class ArmStrongNumber {

	
	public static void main(String[] args) {
		boolean result=checkArmstrong(153);
		
		System.out.println("the give no is "+(result==true?"armstrong":"not an armstrong"));
	}

	private static boolean checkArmstrong(int checkNum) {
		int temp=checkNum;
		int sum=0;
		int lastDigit=0;
		while(temp>0) {
			lastDigit=temp%10;
			sum+=(lastDigit*lastDigit*lastDigit);
			temp=temp/10;
		}
		
		return (sum==checkNum) ?  true :  false;
	}
}
