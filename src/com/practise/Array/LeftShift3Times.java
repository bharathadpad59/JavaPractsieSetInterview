package com.practise.Array;

public class LeftShift3Times {

	public static void main(String[] args) {
		int [] arr = new int [] {1, 2, 3, 4, 5};  
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println("-----------------------------------------------");
		
		for (int i = 0; i < 3; i++) {
			int first,j;
			first=arr[0];
			for (j = 0; j < arr.length-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
}
