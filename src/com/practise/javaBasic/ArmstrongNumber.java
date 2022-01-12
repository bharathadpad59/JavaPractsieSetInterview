package com.practise.javaBasic;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// 153: 1 3 + 5 3 + 3 3 = 1 + 125+ 27 = 153

		int input = 153;
		int addition = 0;
		int iNpUt=input;

		while (iNpUt > 0) {
			int temp = iNpUt % 10;
			iNpUt = iNpUt / 10;
			addition += temp * temp * temp;
		}
		if(addition==input) {
			System.out.println("true");
		}
		System.out.println((addition==input) ? "Armstrong Number": "Not an Armstrong Number");
	}
}
