package com.practise.string;

import java.util.Arrays;
import java.util.Collections;

public class Panagram {

	public static void main(String[] args) {
		String allowed = "ab";
		String[] words = {"ad","bd","aaab","baa","badab"};
		System.out.println(countConsistentStrings(allowed, words));
	}
	
	public static int countConsistentStrings(String allowed, String[] words) {
		int count=0;
		for (int i = 0; i < words.length; i++) {
			boolean isThisMatch=false;
			for (int j = 0; j < words[i].length(); j++) {
					if(allowed.contains(Character.toString(words[i].charAt(j)))) {
						isThisMatch=true;
					}else {
						break;
					}
			}
			if(isThisMatch) {
				count++;
			}
			
		}
		  StringBuilder stb= new StringBuilder();
	        for(char c: "Hello".toCharArray()){
	            char x=c;
//	            System.out.println(x);
	            if(x>=65 && x<=90){
	               x=(char) (x+32);
	            }
	            stb.append(x);
	       
	        }
	        String a="a1";
	        System.out.println(Integer.valueOf(Character.toString(a.charAt(1)))+a.charAt(0));
	        System.out.println((char)(Integer.valueOf(a.charAt(1))+a.charAt(0)));
		System.out.println("result=="+stb.toString().substring(0,stb.length()-1));
		
		
		 String s="a1c1e1";
		 char [] ch=s.toCharArray();
	        for(int i=0;i<s.length();i++){
	            if(i%2!=0){
	            ch[i]=  (char)(Integer.valueOf(Character.toString(ch[i]))+ch[i-1]);
	            }

	        }
	        
	    System.out.println("bharat".indexOf('h')+" substring===="+"bharat".substring("bharat".length()/2));
	      String [] words1= {"avcv","cvbd"};
	      Collections.reverse(Arrays.asList(words1[0]));
	      System.out.println(words1[0]);
		
	      Arrays.asList('a','b');
		return count;

    }
}
