package com.codility.array;

public class PeakElementInArray {

	public static void main(String... args) {
		int[] arr = { 1, 3, 20, 4, 1, 0 };
		System.out.println(positionOfFirstOccurrance(arr, 3));
	}

	private static boolean positionOfFirstOccurrance(int[] arr, int x) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if ((arr[mid] >= arr[mid - 1] || mid == 0) && (arr[mid] >= arr[mid + 1] || mid == arr.length - 1)) {
				return true;
			} else if (arr[mid] >= arr[mid + 1])
				low = mid + 1;
			else
				high = mid - 1;
		}
		return false;
	}
}
