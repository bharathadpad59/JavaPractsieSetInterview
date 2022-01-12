package com.practise.abstraction;

class Arrayleftshift
{
	public static int [] swipe(int [] a1) 
	{
		//int [] x=new int[a1.length];
		int[] x= new int[1];
		x[0]=a1[a1.length-1];
		for (int i=a1.length-1;i>0 ;i--) //i=0;i<a1.length-1;i++;
		{
			a1[i]=a1[i-1];
		}
		a1[0]=x[0];
		return a1;
	}
	public static void main(String[] args) 
	{
		int [] a={10,20,30,40};

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		int [] b=swipe(a);
		
		System.out.println("  ");
		for (int j=0;j<b.length ;j++ ) 
		{
			System.out.print(b[j]+" ");
		}
		
	}
}