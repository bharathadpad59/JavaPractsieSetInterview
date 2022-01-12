package com.practise.abstraction;

public class RepeatedNumWithCountWithMinAndMax {

	public static void main(String[] args) {
		int[] a= {10,20,10,30,40,20,10,40,30,60,10,80};
		int[] duplicatesCountofArray=findDuplicateCountOfNos(a);
		printDuplicateArrayValuesWithCount(duplicatesCountofArray,a);
		
	}

	private static void printMaxANdMinValue(int[] a) {
		int max=a[0];
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if(min > a[i]) {
				min=a[i];
			}
		
			if(max < a[i]) {
				max=a[i];
			}
		}
		
		System.out.println("Max Value=="+max+" Min values is=="+min);
	}

	private static void printDuplicateArrayValuesWithCount(int[] duplicatesCountofArray, int[] a) {
		
		for (int i = 0; i < duplicatesCountofArray.length; i++) {
			if(duplicatesCountofArray[i]!=0) {
				System.out.println("the value=="+a[i]+" repeats=="+(duplicatesCountofArray[i]==-999?" 0 times":duplicatesCountofArray[i]+" times"));
			}
		}
		
		printMaxANdMinValue(a);
	}

	private static int[] findDuplicateCountOfNos(int[] a) {
		int[] duplicateCount=new int[a.length];
		for (int i = 0; i < duplicateCount.length; i++) {
			duplicateCount[i]=-1;
		}
		
		for (int i = 0; i < duplicateCount.length; i++) {
			int count=0;
			for (int j = i+1; j < duplicateCount.length; j++) {
				if(a[i]==a[j]) {
					count++;
					duplicateCount[j]=0;
				}
			}
			if(duplicateCount[i]!=0 ) {
					duplicateCount[i]=count;
				
			}
		}
		
		return duplicateCount;
	}
}
