package com.practise.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateInterface {

	public static void main(String[] args) {
		Predicate<Integer> pred= new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				
				return false;
			}
		};
		
		//Now predicate has test method which accepts value and returns boolean condition
		// In the below function filter() uses predicate functional interface so we have tow write
		//conditions so that it should return boolean value with stream
		
//filter() Returns a stream consisting of the elements of this stream that matchthe given predicate
		
		List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		
		List<Integer>result=list.stream().filter(predicate->predicate.equals(3)).collect(Collectors.toList());
		System.out.println(result);
	}
}
