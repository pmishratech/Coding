package code.array;

import java.util.Arrays;

/**
 * 
 * Find length of longest sequence zero in an array of binary numbers
 * @author pankajmishra
 *
 */
public class LongestSeqZeros {

	public static void main(String[] args) {
		solution();
	}

	private static void solution() {
		String bits = Integer.toBinaryString(15);
		String[] split = bits.split("1");
		Arrays.sort(split);
		if (split.length == 0) {
			System.out.println("No solution found !");
		} else {
			int maxLength = split[split.length - 1].length();
			System.out.println(maxLength);
		}
	}
}
