package com.practise.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleCollectionStreamTogether {

	public static void main(String[] args) {
		List<SchoolObj> listOne = new ArrayList<>();
        listOne.add(new SchoolObj("nameA", "schoolX"));
        listOne.add(new SchoolObj("nameC", "schoolZ"));

        List<SchoolObj> listTwo = new ArrayList<SchoolObj>();
        listTwo.add(new SchoolObj("nameA", "schoolX"));
        listTwo.add(new SchoolObj("nameC", "schoolZ"));
        listTwo.add(new SchoolObj("nameB", "schoolY"));
		
		
		
		 // We create a stream of elements from the first list.
	    List<SchoolObj> listOneList = listOne.stream()
	    // We select any elements such that in the stream of elements from the second list
	    .filter(two -> listTwo.stream()
	    // there is an element that has the same name and school as this element,
	        .anyMatch(one -> one.getName().equals(two.getName()) 
	            && one.getSchool().equals(two.getSchool())))
	    // and collect all matching elements from the first list into a new list.
	    .collect(Collectors.toList());
	    // We return the collected list.
	   System.out.println(listOneList);
	}
}
