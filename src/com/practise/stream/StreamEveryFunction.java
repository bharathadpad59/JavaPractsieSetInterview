package com.practise.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEveryFunction {

	static List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,2,7,7));
	static List<SchoolObj> listOne = new ArrayList<>();
    static List<SchoolObj> listTwo = new ArrayList<SchoolObj>();

	public static void main(String[] args) {

	    listOne.add(new SchoolObj("nameA", "schoolX"));
	    listOne.add(new SchoolObj("nameC", "schoolZ"));

	    listTwo.add(new SchoolObj("nameA", "schoolX"));
	    listTwo.add(new SchoolObj("nameA", "schoolX"));
	    listTwo.add(new SchoolObj("nameC", "schoolZ"));
	    listTwo.add(new SchoolObj("nameB", "schoolY"));
	    
	    
	    
	    boolean result1=listOne.stream().allMatch(pred->pred.getName().equals("nameA"));
	    System.out.println(result1);
	    boolean result2=listOne.stream().anyMatch(pred->pred.getName().equals("nameA"));
	    System.out.println(result2);
	    boolean result3=list.stream().equals(2);
	    System.out.println(result3);
	    boolean result4=list.stream().noneMatch(predicate->predicate.equals(9));
	    System.out.println(result4);
	    Set<Integer> result5=list.stream().collect(Collectors.toSet());
	    System.out.println(result5);
	    long result6=list.stream().count();
	    System.out.println(result6);

	    //using hashcode and equals method in pojo u can easily add unique values from list
	    // to map by using distinct() method
	    Map<String,String> result7=listTwo.stream().distinct()
	    		.collect(Collectors.toMap(SchoolObj:: getName, SchoolObj :: getSchool));
	    System.out.println(result7);
	    
	    System.out.println(listTwo.stream().findFirst().get());
	    
	    //findAny() method use to check whether listTwo elements exists in listOne or not
	    System.out.println("FinadAny=="+listTwo.stream()
	    .filter(pred->listOne.contains(pred))
	    .findAny().get());
	    
	    
	    listTwo.stream().iterator().forEachRemaining(System.out:: println);
	    }
}
