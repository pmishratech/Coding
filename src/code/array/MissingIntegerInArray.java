package code.array;

import java.util.HashSet;

/**
 * 
 * Find missing element in an array having duplicates.
 * @author pankajmishra
 *
 */
public class MissingIntegerInArray {

	public static void main(String[] args) {
		int[] A = { 1, 3, 6, 4, 1, 2 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		int sum = 0;
		int n = A.length;
		HashSet<Integer> hset = new HashSet<Integer>();

		for (int i = 0; i < n; i++) {
			hset.add(A[i]);
		}
		for (Integer i : hset) {
			sum += i;
		}

		return n * (n + 1) / 2 - sum;
	}
}
