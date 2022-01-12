package com.practise.constructor;

class DefaultConstructor   
{  
    int test_a, test_b;  
    DefaultConstructor(int a, int b)   
    {  
    test_a = a;   
    test_b = b;   
    }  
    public static void main (String args[])   
    {  
    	DefaultConstructor test = new DefaultConstructor();   
        System.out.println(test.test_a+" "+test.test_b);  
    }  
}  