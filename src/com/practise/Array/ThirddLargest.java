package com.practise.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirddLargest {

	public static void main(String[] args) {
		Integer [] arr= {13,6,89,54,67,3};
		List<Integer> list=Arrays.asList(arr);
		
		Collections.sort(list,(o1, o2) -> (o1 > o2) ? 1 :
            (o1 < o2) ? -1 : 0);
		System.out.println(list);
		System.out.println(list.get(list.size()-3));
	}
}
