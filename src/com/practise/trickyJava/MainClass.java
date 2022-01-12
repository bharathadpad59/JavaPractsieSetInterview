package com.practise.trickyJava;

public class MainClass {

	public static void main(String[] args) {
//		ClassInstantionaPossible x= new ClassInstantionaPossible();
		//1) Not possible. Because while instantiating, constructor will be called recursively
//		ClassInstantionaPossible xyz=x.a;
		System.out.println("-----------------------------------------------------------");
		
		WillThisCodeWork a = null;
        a.staticMethod();
//2) Yes, the code is correct. You can call static methods through reference variable which is pointing to null. Output will be,
//   Static Method
        System.out.println("-----------------------------------------------------------");       
        
        B b = new B();
        System.out.println(b.i);
        
//        Integer i = new Integer(null);
//        System.out.println(i);//numberFormatException
        
//        String s = new String(null);  //this will give compile error
        
        int z = 10 + + 11 - - 12 + + 13 - - 14 + + 15;
        System.out.println(10 + + 11);
        
        System.out.println(z);
	}
}
