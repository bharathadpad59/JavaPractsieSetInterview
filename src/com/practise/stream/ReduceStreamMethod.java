package com.practise.stream;

import java.util.ArrayList;
import java.util.List;

public class ReduceStreamMethod {
	//reduce() is used for aggregation
	
	public static void main(String[] args) {
		
		List<Integer> r = new ArrayList<>();
		r.add(1);
		r.add(2);
		r.add(3);

		
		System.out.println(r.stream().reduce((val1,val2)->val1+val2).get());
		System.out.println(r.stream().mapToDouble(val->Math.pow(val, 3)).reduce((s1,s2)->s1+s2));
		System.out.println(Math.pow(2, 3));
	}

}
