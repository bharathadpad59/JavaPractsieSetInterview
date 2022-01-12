package com.practise.abstraction;

public class BubbleSort {

	public static void main(String[] args) {
		int[] val= {10,30,80,92,11,45,67,6};
		
		int tmp;
		for (int i = 0; i < val.length; i++) {
			for (int j = i+1; j <= val.length-1; j++) {
				if(val[i]>val[j]) {
					tmp=val[i];
					val[i]=val[j];
					val[j]=tmp;
				}
				System.out.println(val.length+" j value==="+j);
			}
			

		}
		
		for (int i = 0; i < val.length; i++) {
			System.out.println(val[i]);
		}
	}
}
