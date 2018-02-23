package code.array;

class FrequencyArray {

	static int[] result;

	public static void main(String args[]) {

		int[] nums = { 1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10 };
		int length = nums.length;
		findFrequency(nums, length);

	}

	public static void findFrequency(int[] nums, int length) {

		result = new int[nums[length - 1] + 1];
		find(nums, 0, length - 1, result);
		for (int i = 0; i < result.length; i++) {
			if (result[i] > 0)
				System.out.println("Count of " + i + " is " + result[i]);
		}
	}

	public static void find(int[] nums, int low, int high, int result[]) {

		if (nums[low] == nums[high]) {
			result[nums[low]] += high - low + 1;
		} else {
			int mid = (low + high) / 2;
			find(nums, low, mid, result);
			find(nums, mid + 1, high, result);
		}

	}

}