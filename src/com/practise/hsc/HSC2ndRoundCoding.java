package com.practise.hsc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HSC2ndRoundCoding {
	static List<Integer> result= new ArrayList<>();

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> l2 = Arrays.asList(1, 3, 5, 7, 9);

		List<Integer> finalResult = uncommonMethod(l1, l2);
		System.out.println(finalResult);
	}

	private static List<Integer> uncommonMethod(List<Integer> l1, List<Integer> l2) {
		
//		   List<Integer> listOneList = l1.stream()
//				    // We select any elements such that in the stream of elements from the second list
//				    .filter(two -> l2.stream()
//				    // there is an element that has the same name and school as this element,
//				        .anyMatch(one -> one.equals(two) 
//				            && two.equals(one)))
//				    // and collect all matching elements from the first list into a new list.
//				    .collect(Collectors.toList());
//				    // We return the collected list.
		   
		   List<Integer> result1=l1.stream().filter(one->l2.stream().noneMatch(two->two.equals(one))).
				collect(Collectors.toList());
		   List<Integer> result2=l2.stream().filter(one->l1.stream().noneMatch(two->two.equals(one))).
					collect(Collectors.toList());
		   
		   result2.addAll(result1);
		   System.out.println("Result-1=="+result1+" Result-2=="+result2);
//		   System.out.println("Stream Result==="+listOneList);

		if (l1 != null && !l1.isEmpty()) {
			for (int i = 0; i < l2.size(); i++) {
				if (!l1.contains(l2.get(i))) {
					result.add(l2.get(i));

				}
			}
		}
		for (int i = 0; i < l1.size(); i++) {
			if (!l2.contains(l1.get(i))) {
				result.add(l1.get(i));

			}
		}

		return result;
	}
}
