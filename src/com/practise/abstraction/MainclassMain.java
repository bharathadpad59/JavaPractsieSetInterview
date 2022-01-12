package com.practise.abstraction;

class StackDS 
{
	private int [] stack;
	private final int default_size=5;
	private int size=0;
	private int top=-1;
	private IndexOutOfBoundsException ref=new IndexOutOfBoundsException();


public StackDS()
{
	stack=new int[default_size];
}
public void push(int value)
{
	if(size<5)
	{
		stack[++top]=value;
		size++;
		System.out.println(value+" is added to stack");
	}
	else
	{
		throw ref;
	}

}

public int pop()
{

	if(size!=0)
	{
		size--;
		return stack[top--];
	}
	else
	{
		throw ref;
	}
}
public int size()
{
	return size;
}
@Override
public String toString()
{
	String elems=" ";
	for (int i=top;i>=0;i--) 
	{
		elems=elems+" "+stack[i];
	}
	return elems;
}

}

class MainclassMain
{
	public static void main(String[] args) 
	{
		StackDS s1=new StackDS();
		System.out.println("size="+s1.size());
		System.out.println("\n");

		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		System.out.println("\n");
		System.out.println("size new="+s1.size());
		System.out.println(s1);
		

		System.out.println("size new="+s1.size());

		while(s1.size()!=0)   //u can use top!=-1 ,but we should create itsmethod as like size and then freely use it.
		{
			System.out.println(s1.pop());
		}
		
		System.out.println("size="+s1.size());
	}
}