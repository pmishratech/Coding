package com.codility.array;

import java.util.HashMap;
import java.util.Map;

public class FindPairsWithEqualSum {

	public static void main(String... args) {
		int[] arr = { 3, 4, 7, 1, 2, 9, 8 };
		findPairs(arr, 7);
	}

	private static void findPairs(int[] arr, int n) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				sum = arr[i] + arr[j];

				if (map.containsKey(sum)) {
					System.out.println("Pairs are: " + map.get(sum) + " and " + arr[i] + "," + arr[j]);
				} else {
					map.put(sum, new String(arr[i] + "," + arr[j]));
				}
			}
		}
	}
}
