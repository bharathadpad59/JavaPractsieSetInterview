package com.practise.javaBasic;

public class Fibonaci {
	public static void main(String[] args) {
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

		int a = 0;
		int b = 1;
		int c = 0;
		int length=2;
		System.out.print("FDibonacci series till 20 are " + a + " " + b + " ");
		while (length < 20) {
			length++;
			c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
	}

}
