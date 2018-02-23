package com.codility.array;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String str = "pankanpjil";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}

		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) >= 1) {
				System.out.println("Answer is:" + str.charAt(i));
				break;
			}
		}
	}
}
