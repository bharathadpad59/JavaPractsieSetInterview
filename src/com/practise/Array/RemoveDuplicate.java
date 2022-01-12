package com.practise.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };

		int[] newArr = new int[arr.length];

		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				newArr[j++] = arr[i];
			}
		}
		newArr[j] = arr[arr.length - 1];

		System.out.print(Arrays.toString(arr));
		System.out.print(Arrays.toString(newArr));

		System.out.println("-----------------------------------");
		
		List<Integer> lisOfArray = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		Set<Integer> set= new LinkedHashSet<>(lisOfArray);
		
		System.out.println(set);
		
		
		
		
//		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// To boxed array
//		Integer[] what = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//		Integer[] ever = IntStream.of(data).boxed().toArray(Integer[]::new);
//		int[] intArray = Arrays.stream(what).mapToInt(Integer::intValue).toArray();
//		System.out.println(Arrays.toString(intArray));
//		// To boxed list
//		List<Integer> you = Arrays.stream(data).boxed().collect(Collectors.toList());
//		List<Integer> like = IntStream.of(data).boxed().collect(Collectors.toList());
//
//		System.out.println("what==" + Arrays.toString(what) + " ever==" + Arrays.toString(ever) + " you==" + you
//				+ " like==" + like);
	}

}
