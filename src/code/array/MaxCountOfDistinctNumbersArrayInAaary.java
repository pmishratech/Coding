package code.array;

import java.util.HashSet;
import java.util.Set;

public class MaxCountOfDistinctNumbersArrayInAaary {

	public static void main(String[] args) {
		MaxCountOfDistinctNumbersArrayInAaary obj = new MaxCountOfDistinctNumbersArrayInAaary();
		int[] A = { 5, 4, 0, 3, 1, 6, 2 };
		System.out.println(obj.solution(A));
	}

	public int solution(int[] A) {
		int maxCount = 0;
		if (A == null || A.length == 0) {
			return maxCount;
		}
		Set<Integer> set = new HashSet<Integer>();
		int value = 0;
		for (int i = 0, k = 0; i < A.length; i++, k++) {
			if (set.contains(i)) {
				continue;
			}
			int count = 1;
			value = A[k];
			while (value != k && (value >= 0 && value < A.length)) {
				count++;
				set.add(value);
				value = A[value];
			}
			if ((value < 0 || value >= A.length)) {
				count = -1;
				break;
			}
			maxCount = count > maxCount ? count : maxCount;
		}
		return maxCount;
	}

}
