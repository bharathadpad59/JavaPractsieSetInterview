package com.practise.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {

	public static void main(String[] args) {
		
		// fail safe Iterator
		
		 CopyOnWriteArrayList<Integer> list   
         = new CopyOnWriteArrayList<>(new Integer[] { 1, 7, 9, 11 });   
     java.util.Iterator<Integer> itr=  list.iterator();   
     while (itr.hasNext()) {   
         Integer i =itr.next();   
      // It will not be printed  
         //This means it has created a separate copy of the collection  
         System.out.println(i);   
         if (i == 7)   
             list.add(15); 
//         itr.remove();
        
     }   
     System.out.println("List==="+list);
     
 //*********************************************************************************************  
     
 	//fail fast iterator
 	
 	List<Integer> lst= new ArrayList<>(Arrays.asList(1,2,3,43,5));
 	Iterator<Integer> it= lst.iterator();
 	
 	while (it.hasNext()) {
		Integer integer = (Integer) it.next();
		System.out.println(integer);
		lst.add(22);
		
	}
	}

}
