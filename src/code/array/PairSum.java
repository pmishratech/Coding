package code.array;

/**
 * 
 * Find in array the pair equal to sum
 * @author pankajmishra
 *
 */
class PairSum {
	private static final int MAX = 100000; 

	static void printpairs(int arr[], int sum) {
		boolean[] binmap = new boolean[MAX];

		for (int i = 0; i < arr.length; ++i) {
			int temp = sum - arr[i];

			if (temp >= 0 && binmap[temp]) {
				System.out.println("Pair with given sum " + sum + " is ("
						+ arr[i] + ", " + temp + ")");
			}
			binmap[arr[i]] = true;
		}
	}

	// Main to test the above function
	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, 8 };
		int sum = 16;
		printpairs(A, sum);
	}
}