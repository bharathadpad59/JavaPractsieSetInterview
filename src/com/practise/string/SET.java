package com.practise.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SET {

	public static void main(String[] args) {
		Set<Character> s = new HashSet<>();

		String s1 = "aaaabbbbcccc";

		for (Character character : s1.toCharArray()) {
			s.add(character);
		}
		StringBuilder stb = new StringBuilder();
		s.stream().sorted();
		stb.append(s.toArray(new Character[0]));
		s.stream().sorted((a, b) -> a > b ? -1 : 1);
		stb.append(s.toArray(new Character[0]));
		s.stream().sorted();
		stb.append(s.toArray(new Character[0]));
		s.stream().sorted((a, b) -> a > b ? -1 : 1);
		stb.append(s.toArray(new Character[0]));

		
		System.out.println(stb.toString());
	}
}
