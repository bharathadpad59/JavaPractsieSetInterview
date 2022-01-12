package com.practise.abstraction;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

abstract class Bike{  
	   abstract Integer run(int a);
	}  

interface hello{
	static int getIntMultiply() {
		return 0;
	}
	
	default int getdefaultval() {
		return 0;
	}
	
	abstract int getval();
}
 public  class Test1 implements hello, Comparator, Comparable {  
//	void run(){System.out.println("running safely");}  
	
	
	public static void main(String args[]) throws IOException{  
//		Runtime.getRuntime().exec("notepad");
		
		  Map<String, String> empName = new HashMap<String, String>();   
          empName.put("Sam Hanks", "New york");   
          empName.put("Will Smith", "LA");   
          empName.put("Scarlett", "Chicago");   
		
          Iterator iterator = empName.keySet().iterator();   
          while (iterator.hasNext()) {   
              System.out.println(empName.get(iterator.next()));   
              // adding an element to Map   
              // exception will be thrown on next call   
              // of next() method.   
              iterator.remove();
              empName.put("Istanbul", "Turkey");   
          }   
          Arrays.asl
		String a="bharat";
		String b="bharat";
		a.concat("hadpad");
		
		System.out.println("A==="+a+"  b===="+b);
		
	 Integer result= new Bike() {
		
		@Override
		Integer run(int a) {
			System.out.println("hi abstarct anonymous here......");
			return a;
			
		}
	}.run(1);  
	
	
	System.out.println("Result====="+result);
	System.out.println(new Test1().getdefaultval()+" static value===="+hello.getIntMultiply());
	}

@Override
public int getval() {
	// TODO Auto-generated method stub
	return 0;
}

//comparator
@Override
public int compare(Object o1, Object o2) {
	// TODO Auto-generated method stub
	return 0;
}

//comparable(string implements)
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}

} 