package com.codility.array;

public class NumberOccurenceFisrtAndLast {

	public static void main(String... args) {
		int[] arr = { 1, 2, 3, 3, 3, 6, 7 };
		System.out.println(positionOfFirstOccurrance(arr, 3));
	}

	private static int positionOfFirstOccurrance(int[] arr, int x) {
		int low = 0, high = arr.length - 1, result = -1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == x) {
				high = mid - 1;// First occurrence
				// low = mid + 1; This one is for last occurrence
				result = mid;
			} else if (arr[mid] < x)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return result;
	}
}
