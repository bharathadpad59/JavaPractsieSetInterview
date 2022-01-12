package com.practise.abstraction;

class Practise9
{
	public static void main(String[] args) 
	{
		String s1="BHARATHADPAD";
                                                 // substring usage
		int n=3;
		int len=s1.length();
		int divlen=s1.length()/n;

		String[] str=new String[n];

		int k=0;
		for (int i=0;i<len;i=i+divlen) 
		{
			String subpart=s1.substring(i,i+divlen);
			str[k++]=subpart;
		
		}

		for (int j=0;j<str.length;j++) 
		{
			System.out.println(str[j]);
		}

	}
}

