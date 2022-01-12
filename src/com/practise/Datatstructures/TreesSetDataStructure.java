package com.practise.Datatstructures;

import java.util.TreeSet;

//By default, It maintains an ascending order. It contains unique elements only.
//It doesn’t allow null elements. Access and retrieval times are quite fast. 
//To add the user-defined object into TreeSet, we need to implement a Comparable interface. 
//An element that we want to add in TreeSet must be a comparable type. 
//If we don’t implement the Comparable interface then it will throw ClassCastException. 
public class TreesSetDataStructure {
	
	public static void main(String[] args) {
		TreeSet<Integer> tree= new TreeSet<>();
		
		tree.add(2);
		tree.add(1);
		tree.add(6);
		tree.add(4);
		
		System.out.println(tree);
//Comparator interface compare(Object o1, Object o2) impl we have provided in TreeSet() Method Params
// more priority then Comparable interface impl which is there
// in student class ie compareTo(Object o) method
		TreeSet<Student> tree1= new TreeSet<>((a,b)->a.getRollno()>b.getRollno()?-1:1);
		tree1.add(new Student(1, "bharat"));
		tree1.add(new Student(4, "basav"));
		tree1.add(new Student(2, "raju"));
		tree1.add(new Student(3, "harbhajan"));
		
		System.out.println(tree1);
		
	}

}
