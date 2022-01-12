package com.practise.Array;

import java.util.Arrays;
import java.util.TreeSet;

public class BiggestInArray {

	public static void main(String[] args) {
		TreeSet<Integer> ts= new TreeSet<>(Arrays.asList(25, 11, 7, 75, 56));
		System.out.println(ts.pollLast());
		
		System.out.println(ts.descendingSet().pollFirst());//descending will simply reverse the list
		System.out.println(ts.higher(7));//1
		
	}
		
		
		
}
