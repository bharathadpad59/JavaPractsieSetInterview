package com.practise.methodReferences;

import java.util.List;
import java.util.ArrayList;

public class MethodRefrence {

   public static void main(String args[]) {
      List names = new ArrayList();
		
      names.add("1");
      names.add("2");
      names.add("3");
      names.add("4");
      names.add("5");
		
      names.sort((name1,name2) -> name1.hashCode()>name2.hashCode() ? 1: -1);
      names.removeIf(name->name.equals("3"));
      names.forEach(System.out::println);
   }
}
