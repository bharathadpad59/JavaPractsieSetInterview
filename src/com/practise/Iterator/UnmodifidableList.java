package com.practise.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

public class UnmodifidableList {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		Queue<Integer> q= new LinkedList<>();
		
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
		list=Collections.unmodifiableList(list);
		
//		list.add(11); //all these operations will give Exception- unsupported Exception
//		list.remove(0);
//		list.set(0, 11);
		System.out.println(list);
		
		List<Integer> llist= new CopyOnWriteArrayList<>();
		llist.add(1);llist.add(2);llist.add(3);llist.add(4);llist.add(5);
		llist.remove(2);
		System.out.println(llist);
	}
}
