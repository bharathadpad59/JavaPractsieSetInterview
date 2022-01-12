package com.practise.abstraction;

class Practise11
{
	public static void main(String[] args) 
	{
		String s1="Big black bug bit a big black dog on his big extraordinay nose";
		
		s1= s1.toLowerCase();

		String words[] = s1.split(" ");           // Program to print small and large WORDS 
		
		String small=" ";
		String large=" ";


		small=large=words[0];

		for(int i=0;i<words.length;i++) 
		{
			
			if (small.length()>words[i].length()) 
			{
				small=words[i];
			}

			if (large.length()<words[i].length()) 
			{
				large=words[i];
			}

		}

		System.out.println("Small word is ="+small);
		System.out.println("Large word is="+large);
	}
}