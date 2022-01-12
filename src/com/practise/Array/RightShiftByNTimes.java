package com.practise.Array;

import java.util.Arrays;
import java.util.Scanner;

public class RightShiftByNTimes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int [] arr= {1,3,4,5,6,9};
		System.out.println("Enter number of times you want shift");
		int times=scn.nextInt();
		
		for(int i=1; i<=times; i++) {
			rightShiftNTimes(arr);
		}
	}
	
	public static void rightShiftNTimes(int[] arr) {
		int i,temp=arr[arr.length-1];
		for (i = arr.length-1; i >0 ; i--) {
			arr[i]=arr[i-1];
		}
		arr[i]=temp;
		System.out.println(Arrays.toString(arr));
	}
}
