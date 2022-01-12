package com.practise.customArrayList;

import java.util.ArrayList;

public class ArrayListWIthNoDuplicates extends ArrayList{
	
	@Override
	public boolean add(Object e) {
		if(this.contains(e)) {
			return false;
		}else
		return super.add(e);
	}

	public static void main(String[] args) {
		ArrayListWIthNoDuplicates listWithNoDupl=new ArrayListWIthNoDuplicates();
		listWithNoDupl.add(2);
		listWithNoDupl.add(2);
		listWithNoDupl.add(1);
		
		
		System.out.println(listWithNoDupl);
	}
}
