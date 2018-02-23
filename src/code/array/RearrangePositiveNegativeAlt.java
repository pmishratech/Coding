package code.array;

public class RearrangePositiveNegativeAlt {

	public static void main(String[] args) {
		int arr[] = { 2, 3, -4, -1, 6, -9 };
		rearrange(arr, arr.length);
	}

	public static void rearrange(int arr[], int n) {
		int i = -1, j = n;

		// shift all negative values to the end
		while (i < j) {
			while (arr[++i] > 0)
				;
			while (arr[--j] < 0)
				;
			if (i < j)
				swap(i, j, arr);
		}

		// i has index of leftmost negative element
		if (i == 0 || i == n)
			return;

		// start with first positive element at index 0

		// Rearrange array in alternating positive &
		// negative items
		int k = 0;
		while (k < n && i < n) {
			// swap next positive element at even position
			// from next negative element.
			swap(k, i, arr);
			i = i + 1;
			k = k + 2;
		}

		for (int k2 = 0; k2 < arr.length; k2++) {
			System.out.print(arr[k2]+" ");
		}
	}

	private static void swap(int i, int j, int arr[]) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
