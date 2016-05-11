package com.codility;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatingSubstring {
	public static void main(String[] args) {
		String str = "aabcd";
		System.out.println(getLongestSubstringNonRepeating(str));
	}

	public static String getLongestSubstringNonRepeating(String inputStr) {
		StringBuilder longestSubStr = new StringBuilder();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int subStartIndex = 0;
		int subEndIndex = 0;
		int j = 0;
		int maxLength = 0;

		for (int i = 0; i < inputStr.length(); i++) {
			if (!map.containsKey(inputStr.charAt(i))) {
				map.put(inputStr.charAt(i), 1);
				longestSubStr.append(inputStr.charAt(i));
			}
			if (maxLength < longestSubStr.length()) {
				maxLength = longestSubStr.length();
				subStartIndex = j;
				subEndIndex = i;
				longestSubStr = new StringBuilder();
				map.clear();
				i--;
			}
		}

		return inputStr.substring(subStartIndex, subEndIndex);
	}

}
