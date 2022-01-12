package com.practise.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapDS {
	

	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<>();
		map.put(1, 12345);
		map.put(5,5);
		map.put(12, 1234);
		map.put(6, 26);
		map.put(2,2);
		map.put(3,3);
		map.put(0, 0);
		map.put(0, 1);
		
		
		List<Map.Entry<Integer, Integer> > list1 =
	               new LinkedList< >(map.entrySet());
		Collections.sort(list1, (a,b)->a.getValue().compareTo(b.getValue()));
		
		 // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Integer,Integer> aa : list1) {
            temp.put(aa.getKey(), aa.getValue());
        }
		
		System.out.println(temp);
		System.out.println("*********************");
		
		
		List<Integer> list= new ArrayList<>(map.keySet());
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		System.out.println(list.stream().sorted((o1,o2)->o1>o2?-1:1).collect(Collectors.toMap(k->k,v->map.get(v))));
	}
}
