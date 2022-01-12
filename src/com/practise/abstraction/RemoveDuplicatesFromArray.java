package com.practise.abstraction;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] a= new int[]{10,20,10,30,40,20,10,40,30,60,10,80};
		
		int[] result=removeDuplicatearray(a);
		System.out.println("length id==="+result.length + "  \nand Final Result==");
		for (int i=0 ;i<result.length;i++) {
			if(result[i]!=0)
			System.out.println(result[i]);
		}
		
	}

	private static int[] removeDuplicatearray(int[] a) {
		int [] result=new int[a.length];
		int increment=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					a[j]=-1;
				}
			}
			if(a[i]!=-1) {
				result[increment++]=a[i];
			}
		}
		
		return result;
	}
}
