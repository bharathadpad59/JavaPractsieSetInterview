package com.practise.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequenecyOfArrayElements {

	public static void main(String[] args) {
		// 1 2 8 3 2 2 2 5 1
		
		Map<Integer,Integer> map= new HashMap<>();

		int[] arr1 = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		
		System.out.print(Arrays.toString(arr1));System.out.println();
		
		for (int i = 0; i < arr1.length; i++) {
			int count=1;
			for (int j = i+1; j < arr1.length; j++) {
				if(arr1[i]==arr1[j]) {
				
					count++;
					arr1[j]=0;
				}
			}
			if(arr1[i]!=0 && count>1) {
				System.out.println("Duplicate value Exists for Number: "+arr1[i]);
			map.put(arr1[i], count);
			}
		}
		
		System.out.println(map);
		countFreq(arr1,arr1.length);
	}
	
	  static void countFreq(int arr[], int n)
	    {
	        Map<Integer, Integer> mp = new HashMap<>();
	 
	        // Traverse through array elements and
	        // count frequencies
	        for (int i = 0; i < n; i++)
	        {
	            if (mp.containsKey(arr[i]))
	            {
	                mp.put(arr[i], mp.get(arr[i]) + 1);
	            }
	            else
	            {
	                mp.put(arr[i], 1);
	            }
	        }
	        // Traverse through map and print frequencies
	        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
	        {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	    }
}
