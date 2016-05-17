package com.codility.array;

public class MinPathFromTopToBottomTree {

	public static void main(String... args) {
		int[][] arr = { { 2 }, { 3, 4 }, { 6, 5, 7 }, { 4, 1, 8, 3 } };

		int[] resultArr = mimimumPathfromTopToBottom(arr);

		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
	}

	private static int[] mimimumPathfromTopToBottom(int[][] arr) {

		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < arr[i].length; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
					result[i] = min;
				}
			}
		}
		return result;
	}

}
