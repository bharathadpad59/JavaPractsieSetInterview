package com.practise.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
	
	public static void main(String[] args) {
		Consumer<Integer> conumer=(intVal) -> System.out.println(intVal);
//		conumer.accept(2);
		
		List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		
		//foreach is accepting Consumer functionla inteface implementaion
		//filter is acceptiong predicate functionla inteface implementaion
		list.stream().filter((val)-> val%2==0).forEach(consumer -> System.out.println(consumer));
		
	}

}
