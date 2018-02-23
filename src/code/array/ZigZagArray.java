package code.array;

import java.util.Arrays;

public class ZigZagArray {

	public static void main(String[] args) {
		int arr[] = { 4, 3, 7, 8, 6, 2, 1 };
		zigZag(arr, arr.length);
		Arrays.asList(arr).forEach(System.out:: println);
		for (int i : arr) {
			System.out.print(i+" ");
		}

	}

	// Program for zig-zag conversion of array
	public static void zigZag(int arr[], int n) {
		// Flag true indicates relation "<" is expected,
		// else ">" is expected. The first expected relation
		// is "<"
		boolean flag = true;

		for (int i = 0; i <= n - 2; i++) {
			if (flag) /* "<" relation expected */
			{
				/*
				 * If we have a situation like A > B > C, we get A > B < C by
				 * swapping B and C
				 */
				if (arr[i] > arr[i + 1])
					swap(arr, i, i+1);
			} else /* ">" relation expected */
			{
				/*
				 * If we have a situation like A < B < C, we get A < C > B by
				 * swapping B and C
				 */
				if (arr[i] < arr[i + 1])
					swap(arr, i, i+1);
			}
			flag = !flag; /* flip flag */
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
