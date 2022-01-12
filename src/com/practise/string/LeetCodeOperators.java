package com.practise.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class LeetCodeOperators {

	public static void main(String[] args) {
		LeetCodeOperators l = new LeetCodeOperators();
		String[] operations = { "--X", "X++", "X++" };
		System.out.println("Result==="+l.finalValueAfterOperations(operations));
		String a= "255.100.50.0";   //"255[.]100[.]50[.]0"
//		a.contains(s)
		char ab='a';
		a=a.replace(".", "[.]");
		System.out.println(a);
		
		Map<Integer,String> map= new HashMap();
		map.put(3, "third");
		map.put(2, "second");
		map.put(1, "first");
		List<String> list=map.entrySet()
		  .stream()
		  .sorted(Map.Entry.<Integer,String>comparingByKey()).map(Map.Entry::getValue)
		  .collect(Collectors.toList());

		for (String string : list) {
			
		}
		String []  word1 = {"ab", "c"};
		String [] word2 = {"a", "bc"};
//		Arrays.sort(word1);Arrays.sort(word2);
//		System.out.print(Arrays.toString(word1));
//		System.out.println();
//		System.out.print(Arrays.toString(word2).equals(Arrays.toString(word1)));
//		StringBuilder stb1= new StringBuilder(Arrays.toString(word1));
//		StringBuilder stb2= new StringBuilder(Arrays.toString(word2));
//		System.out.println(stb1.toString());
//		System.out.println(stb2.toString());
//		System.out.println(stb1.toString().equals(stb2.toString()));
		
		
		String a1="Z";
		System.out.println(a1.codePointAt(0));
		System.out.println("ab".contains("a"));
	}

	public int finalValueAfterOperations(String[] operations) {
		int k = 0;
		for (int i = 0; i < operations.length; i++) {
			if (operations[i].indexOf("++") >=0) {
				++k;
			} else if (operations[i].indexOf("--") >=0) {
				k--;
			}
		}

		return k;
	}

}
