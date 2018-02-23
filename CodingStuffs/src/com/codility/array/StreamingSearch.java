package com.codility.array;

public class StreamingSearch {

	public static void main(String[] args) {
		String str = "mycatiscatcat";
		int i = 0;
		String searchPattern = "cat";
		StringBuilder searchString = new StringBuilder();
		char[] strChar = str.toCharArray();
		int count = 0;

		while (i < strChar.length) {
			searchString.append(strChar[i]);
			if (searchString.length() == searchPattern.length()) {
				if (searchString.indexOf(searchPattern) == 0) {
					count++;
				}
				searchString.deleteCharAt(0);
			}
			i++;
		}
		
		System.out.println(count);
	}

}
