package com.amazon;

/**
 * first find from mid to start number whic is smaller than right->mark number
 * with smallest, then find number which is next greater than smallest to right
 * of smallest -> then swap-> then reverse all numbers from smallest number
 * index+1 to mid coz all are in descending order// Same for right side.
 * 
 * @author pankajmishra
 *
 */
class NextHigherPalindrome {
	// function to reverse the digits in the
	// range i to j in 'num'
	public static void reverse(char num[], int i, int j) {
		while (i < j) {
			char temp = num[i];
			num[i] = num[j];
			num[j] = temp;
			i++;
			j--;
		}
	}

	// function to find next higher palindromic
	// number using the same set of digits
	public static void nextPalin(char num[], int n) {
		// if length of number is less than '3'
		// then no higher palindromic number
		// can be formed
		if (n <= 3) {
			System.out.println("Not Possible");
			return;
		}
		char temp;

		// find the index of last digit
		// in the 1st half of 'num'
		int mid = n / 2 - 1;
		int i, j;

		// Start from the (mid-1)th digit and
		// find the the first digit that is
		// smaller than the digit next to it.
		for (i = mid - 1; i >= 0; i--)
			if (num[i] < num[i + 1])
				break;

		// If no such digit is found, then all
		// digits are in descending order which
		// means there cannot be a greater
		// palindromic number with same set of
		// digits
		if (i < 0) {
			System.out.println("Not Possible");
			return;
		}

		// Find the smallest digit on right
		// side of ith digit which is greater
		// than num[i] up to index 'mid'
		int smallest = i + 1;
		for (j = i + 2; j <= mid; j++)
			if (num[j] > num[i] && num[j] < num[smallest])
				smallest = j;

		// swap num[i] with num[smallest]
		temp = num[i];
		num[i] = num[smallest];
		num[smallest] = temp;

		// as the number is a palindrome,
		// the same swap of digits should
		// be performed in the 2nd half of
		// 'num'
		temp = num[n - i - 1];
		num[n - i - 1] = num[n - smallest - 1];
		num[n - smallest - 1] = temp;

		// reverse digits in the range (i+1)
		// to mid
		reverse(num, i + 1, mid);

		// if n is even, then reverse
		// digits in the range mid+1 to
		// n-i-2
		if (n % 2 == 0)
			reverse(num, mid + 1, n - i - 2);

		// else if n is odd, then reverse
		// digits in the range mid+2 to n-i-2
		else
			reverse(num, mid + 2, n - i - 2);

		// required next higher palindromic
		// number
		String result = String.valueOf(num);
		System.out.println("Next Palindrome: " + result);
	}

	// Driver Code
	public static void main(String args[]) {
		String str = "4697557964";
		char num[] = str.toCharArray();
		int n = str.length();
		nextPalin(num, n);
	}
}

// This code is contributed by Danish Kaleem