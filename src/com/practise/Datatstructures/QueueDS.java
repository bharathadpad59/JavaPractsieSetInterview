package com.practise.Datatstructures;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDS {
	public static void main(String[] args) {
		Queue<String> a= new PriorityQueue<>();
		a.add("bharat");
		a.add("hadpad");
		a.add("hero");
		a.add("zero");
		a.add("narrow");
		a.add("sorrow");
		a.poll(); //removes bharat i.e first in first out
		System.out.println(a.peek());
		System.out.println(a);
		
		Queue<String> b= new LinkedList<>();
		b.add("bharat");
		b.add("hadpad");
		b.add("zero");
		b.add("sorrow");
		b.add(null);
		b.add(null);
		
		System.out.println(b);
		
		Deque<String> d= new LinkedList<>();
		d.add("bharat");
		d.add("hadpad");
		d.add("zero");
		d.add("sorrow");
		d.pollLast(); // to behave like a stack last in first out
		d.poll();// to behave like a Queue we use pool i.e first in first out
		System.out.println(d);
		
	}

}
