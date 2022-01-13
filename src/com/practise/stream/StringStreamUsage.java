package com.practise.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringStreamUsage {

	public static void main(String[] args) {
	
		System.out.println("hello".contains("ho"));
		String a="Hello";
		List<Character> list= a.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
		
		int[] intArray= {1,2,3,2,4};
		List<Integer> list2= Arrays.stream(intArray).boxed().collect(Collectors.toList());
		IntStream.of(intArray).boxed().collect(Collectors.toList()); 
		System.out.println(list2);

		System.out.println(list.stream()
				.filter(i -> Collections.frequency(list, i) > 1)
                .collect(Collectors.toSet()));
	}
}
