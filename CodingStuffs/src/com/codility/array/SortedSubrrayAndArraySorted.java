package com.codility.array;

public class SortedSubrrayAndArraySorted {

	public static void main(String[] args) {
		printUnsorted();
	}

	private static void printUnsorted() {
		int[] arr = { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
		int s = 0, e = arr.length - 1, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				s = i;
				break;
			}
		}

		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] < arr[i - 1]) {
				e = i;
				break;
			}
		}

		for (int i = s; i <= e; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}

		for (int i = 0; i < s; i++) {
			if (arr[i] > min) {
				s = i;
				break;
			}
		}

		for (int i = arr.length - 1; i >= e; i--) {
			if (arr[i] < max) {
				e = i;
				break;
			}
		}

		System.out.println("Indexes are :" + s + " nd " + e);
	}

}
