package code.array;
/**
 * 
 * Find index in an array where left array == right array
 * @author pankajmishra
 *
 */
public class EquiIndexInArray {
	public static void main(String[] args) {
		int[] A = { -7, 1, 5, 2, -4, 3, 0 };
		System.out.println(equi(A, 7));
	}

	private static int equi(int arr[], int n) {
		if (n == 0)
			return -1;
		long sum = 0;
		for (int i = 0; i < n; i++)
			sum += (long) arr[i];

		long sum_left = 0;
		for (int i = 0; i < n; i++) {
			long sum_right = sum - sum_left - (long) arr[i];
			if (sum_left == sum_right)
				return i;
			sum_left += (long) arr[i];
		}
		return -1;
	}
}