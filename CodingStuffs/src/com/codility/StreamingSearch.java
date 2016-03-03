package com.codility;

public class StreamingSearch {

	public static void main(String[] args) {
		String str = "mycatiscatcat";
		int i = 0;
		String word = "cat";
		StringBuilder searchWord = new StringBuilder("abc");
		System.out.println(searchWord);
		System.out.println(searchWord.reverse());
		System.out.println(searchWord);
		char[] strChar = str.toCharArray();
		int count = 0;

		while (i < strChar.length) {
			searchWord.append(strChar[i]);
			if (searchWord.length() == word.length()) {
				if (searchWord.indexOf(word) == 0) {
					count++;
				}
				searchWord.deleteCharAt(0);
			}
			i++;
		}
		
		System.out.println(count);
	}

}
