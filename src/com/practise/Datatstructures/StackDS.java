package com.practise.Datatstructures;

import java.util.Stack;

public class StackDS {

	public static void main(String[] args) {
		Stack<String> a= new Stack<>();
		System.out.println(a.capacity());
		a.add("bharat");
		a.push("hadpad");
		a.push("hero");
		System.out.println(a.peek());
		a.pop();   //last in first out pattern
		System.out.println(a);
		System.out.println(a.capacity());
	}
}
