package com.codility.matrix;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortSamePatternInOrdeGroup {
	public static void main(String[] args) {
		Map<String, List<String>> hm = new TreeMap<String, List<String>>();
		String str[] = { "pear", "amleth", "dormitory", "tinsel", "dirty room",
				"hamlet", "listen", "silent" };
		groupAnagrams(str, hm);
		List<Entry<String, List<String>>> list = new ArrayList<Entry<String, List<String>>>(
				hm.entrySet());
		Collections.sort(list, new Comparator<Entry<String, List<String>>>() {

			public int compare(Entry<String, List<String>> o1,
					Entry<String, List<String>> o2) {
				Collections.sort(o1.getValue());
				Collections.sort(o2.getValue());
				for (int i = 0; i < Math.min(o1.getValue().size(), o2
						.getValue().size()); i++) {
					if (o1.getValue().get(i).compareTo(o2.getValue().get(i)) < 0) {
						return -1;
					} else if (o1.getValue().get(i)
							.compareTo(o2.getValue().get(i)) > 0) {
						return 1;
					}
				}
				return 0;
			}
		});

		for (Entry<String, List<String>> e : list) {
			String temp = "";
			for (String s : e.getValue()) {
				temp = temp + s + ",";
			}
			if (temp.length() > 0) {
				temp = temp.substring(0, temp.length() - 1);
			}
			System.out.println(temp);
		}
	}

	public static void groupAnagrams(String[] list,
			Map<String, List<String>> matchMap) {
		for (String word : list) {
			String key = anagramKey(word);
			if (!matchMap.containsKey(key)) {
				matchMap.put(key, new ArrayList<String>());
			}
			matchMap.get(key).add(word);
		}
	}

	private static final String anagramKey(String word) {
		word = word.replaceAll("\\s", "").toLowerCase();
		char[] chars = word.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
}
