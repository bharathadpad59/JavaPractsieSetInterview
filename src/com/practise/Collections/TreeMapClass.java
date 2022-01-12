package com.practise.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(3, "bharat");
		map.put(2, "Raju");
		map.put(1, "salman");
		
		List<Map.Entry<Integer,String> > list =
	               new LinkedList< >(map.entrySet());
//		Set<Integer> set=map.keySet();
//		Collections.sort(new ArrayList<Integer>(set));
//		
//		System.out.println(map);
		
	}
}
