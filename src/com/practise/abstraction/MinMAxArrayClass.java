package com.practise.abstraction;

public class MinMAxArrayClass {

	public static void main(String[] args) {
	
		int[] a= {9,6,12,5,15,16};
		int[] b= {14,7,22,5,32,77};
		int result=minMaxNumber(a, b, a.length, b.length, 9);
		
		System.out.println("Result==="+result);
	}
	
	public static int 	minMaxNumber(int[] a, int[] b, int len1, int len2, int k) {
		int x=0;
		int y=0;
		
		for (int i = 0; i < a.length-1; i++) {
			if(a[i] >= k) {
				x++;
				System.out.println("ans=="+a[i]+"  x==="+x);
			}
		}
		
		for (int j = 0; j < b.length-1; j++) {
			if(a[j] <= k) {
				y++;
				System.out.println("ans 2=="+a[j]);
			}
		}
		
		return x>y?x:y;
	}
}
