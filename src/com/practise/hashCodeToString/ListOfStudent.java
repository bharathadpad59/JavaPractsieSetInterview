package com.practise.hashCodeToString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListOfStudent {

	public static void main(String[] args) {
		List<Student> list= new ArrayList<>();
		list.add(new Student(1, "bharat"));
		list.add(new Student(1, "bharat"));
		System.out.println("*************List***************");
		System.out.println(list);
		System.out.println("*************Hashset***************");
		
		Set<Student> hashSet= new HashSet<>();
		hashSet.add(new Student(1, "bharat"));
		hashSet.add(new Student(1, "bharat"));
		System.out.println(hashSet);
	}
}
