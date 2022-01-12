package com.practise.Array;

public class CopyOneToAnother {

	public static void main(String[] args) {
		int[] arr1 = new int[10];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i;
		}

		int[] arr2= arr1.clone();
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println(arr1.hashCode()+"    "+arr2.hashCode()+" "+arr1.equals(arr2));
	}

}
