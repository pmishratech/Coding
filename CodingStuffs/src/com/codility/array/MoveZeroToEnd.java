package com.codility.array;

public class MoveZeroToEnd {

	public static void main(String... args) {
		int[] arr = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		int[] resultArr = moveAllZerosToEndOfArray(arr);

		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}

	}

	private static int[] moveAllZerosToEndOfArray(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while (count < arr.length)
			arr[count++] = 0;

		return arr;
	}

}
