package com.practise.Array;

import java.util.HashMap;
import java.util.Map;

public class DuplicatePrintInArray {
public static void main(String[] args) {
	int[] arr1 = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
	
	Map<Integer,Integer> map= new HashMap<>();

	for (int i = 0; i < arr1.length; i++) {
		if(map.containsKey(arr1[i])) {
			map.put(arr1[i],map.get(arr1[i]) + 1);
		}else {
			map.put(arr1[i], 1);
		}
	}
	
	map.entrySet().stream().filter(ma -> ma.getValue()> 1).forEach(System.out:: println);
}
}
