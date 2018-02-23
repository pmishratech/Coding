package code.array;

public class DistinctCountInArray {

	public static void main(String[] args) {
		int arr[] = { -2, -1, 0, 1, 1 };
		System.out.println(distinctCount(arr, arr.length));
	}

	public static int distinctCount(int arr[], int n) {
		int count = n;
		int i = 0, j = n - 1, sum = 0;

		while (i <= j) {
			while (i != j && arr[i] == arr[i + 1]) {
				count--;
				i++;
			}

			while (i != j && arr[j] == arr[j - 1]) {
				count--;
				j--;
			}

			if (i == j)
				break;

			sum = arr[i] + arr[j];

			if (sum == 0) {
				count--;
				i++;
				j--;
			} else if (sum < 0)
				i++;
			else
				j--;
		}

		return count;
	}

}
