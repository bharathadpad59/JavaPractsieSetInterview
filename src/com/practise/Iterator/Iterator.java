package com.practise.Iterator;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class Iterator extends AbstractCollection<Integer> {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
		
		ListIterator<Integer> itr= list.listIterator();
		
		while (itr.hasNext()) {
			if(itr.next().equals(3)) { 
				itr.remove();
			}
		}
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		System.out.println(list);
		
		AbstractCollection<Integer> abs= (AbstractCollection<Integer>) list;
		abs.add(25);
		
		java.util.Iterator<Integer>itrrr=abs.iterator();
		while(itrrr.hasNext()) {
			System.out.println(itrrr.next());
		}
		
		
	}

	@Override
	public java.util.Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}
