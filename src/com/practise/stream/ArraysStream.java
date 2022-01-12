package com.practise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class ArraysStream {
	
	static int[] arr= {1,2,3,4,5};
	
	public static void main(String[] args) {
		System.out.println(Arrays.stream(arr).filter(x->x%2==0).sum());
				
		System.out.println("--- DoubleStream ---");
		double[] num = {3.0, 4.7, 5.2, 6.8};
		//You can use Arrays.stream() method to create primitive type Stream.
		// DoubleStream, IntStream are the only way to use stream Api on primitives values 
		//we can store primitives in DoubleStrea, IntStream n all and perform stream operations
		DoubleStream numStream = Arrays.stream(num);
		numStream.forEach(System.out::println);
		
		System.out.println("--- With Specified range ---");
		
		numStream = Arrays.stream(num, 0, 2);
		numStream.forEach(System.out::println);
		
		
		List<Double>result=numStream.map(d->d+2).filter(f->f>6).boxed().collect(Collectors.toList());
		
		System.out.println(result);
	}

}
