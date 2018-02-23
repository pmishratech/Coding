package code.array;

import java.util.HashSet;
import java.util.Set;

public class ArrayPairProduct {

	public static void main(String[] args) {

		int[] a = { 0, 45, 7, 3, 0, 1, 8, 9 };
		System.out.println(isProductHasPair(a, 56));
	}

	public static boolean isProductHasPair(int[] input, int k) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < input.length; i++) {
			if (input[i] == 0) {
				if (k == 0)
					return true;
				else
					continue;
			}
			if (k % input[i] == 0) {
				if (set.contains(k / input[i])) {
					System.out.println(k / input[i] + "," + input[i]);
					return true;
				}
				set.add(input[i]);
			}
		}
		return false;

	}
}