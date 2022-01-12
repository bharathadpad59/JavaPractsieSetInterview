package com.practise.trickyJava;

class A
{
    static int i = 1111;
 
    static
    {
    	System.out.println("A-static-1  "+i--);
    	System.out.println("A-static-2  "+ (i-- - --i));
        i = i-- - --i;
    }
 
    {    System.out.println("A-inner-1  "+i);
        i = i++ + ++i;
    
        System.out.println("A-inner-2  "+i);
    }
}
 
class B extends A
{
    static
    {
    	System.out.println("B-static-1  "+--i);
    	System.out.println("B-static-2  "+ (--i - i--));
        i = --i - i--;
    }
 
    {
    	System.out.println("B-inner-1  "+i);
        i = ++i + i++;
        System.out.println("B-inner-2  "+i);
    }
}
 
