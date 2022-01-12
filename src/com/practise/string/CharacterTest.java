package com.practise.string;

import java.util.HashMap;
import java.util.Map;

public class CharacterTest {

	public static void main(String[] args) {
		String s = "10#11#12";
		Map<String,Character> map = new HashMap<>();
		char ch = 'a';
		int i = 0;
		while (i < 26) {
			if (i > 8) {
				map.put(++i + "#",ch);
			} else {
				map.put(++i + "",ch);
			}
			int val = (int) (ch + 1);
			ch = (char) val;
		}
		System.out.println(map);

		StringBuilder stb = new StringBuilder();
		for (int k = s.length()-1 ; s.length() >0;) {
			if (s.charAt(k) == '#') {
				String temp = Character.toString(s.charAt(k - 2)) + s.charAt(k - 1) + s.charAt(k);
				stb.append(map.get(temp));
				System.out.println(temp+" stb=="+stb.toString());
				if(k>=3) {
				k=k-3;
				}else {
					break;
				}
			} else {
				stb.append(map.get(Character.toString(s.charAt(k))));
				if(k>=1) {
					k=k-1;
					}else {
						break;
					}

			}

		}

		System.out.println(stb.reverse().toString());
	}
}
