package code.array;

import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubArray {

	public static void main(String[] args) {
		subArraySumsZero();
	}

	private static void subArraySumsZero() {
		int[] seed = new int[] { 4,10,-6,-4,0,2,3,-5,1,0,2 };
		int currSum = 0;
		Map<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < seed.length; i++) {
			currSum += seed[i];
			if (currSum == 0) {
				System.out.println("subset : { 0 - " + i + " }");
			} else if (sumMap.get(currSum) != null) {
				System.out.println("subset : { " + (sumMap.get(currSum) + 1)
						+ " - " + i + " }");
				sumMap.put(currSum, i);
			} else
				sumMap.put(currSum, i);
		}
		System.out.println("HASH MAP HAS: " + sumMap);
	}

}
