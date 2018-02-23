package code.array;

import java.util.Arrays;

/**
 * Remove duplicates from an array of small primes
 * @author pankajmishra
 *
 */
public class ReemoveDuplicateWithAllPrime {

	public static void removeDuplicates(int[] primeNum) {
		int tail = 1;
		int checker = primeNum[0];
		for (int i = 1; i < primeNum.length; i++) {

			if (checker % primeNum[i] == 0) {
				continue;
			}
			checker = checker * primeNum[i];
			primeNum[tail] = primeNum[i];
			tail++;
		}
		Arrays.fill(primeNum, tail, primeNum.length, -1);
	}

	public static void main(String args[]) {
		int[] primeNum = { 2, 3, 5, 5, 2, 7, 11, 23 };
		for (int i = 0; i < primeNum.length; i++) {
			System.out.print(primeNum[i] + " ");
		}
		removeDuplicates(primeNum);
		System.out.println("After removing:");
		for (int i = 0; i < primeNum.length; i++) {
			System.out.print(primeNum[i] + " ");
		}

	}
}