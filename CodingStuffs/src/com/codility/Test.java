package com.codility;

public class Test {

	public static void main(String... args) {
		int[] arr = { 3,4,7,1,2,9,8};
		pairSumEqualInArray(arr);
	}

	private static void pairSumEqualInArray(int[] arr) {
		int sum=0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if(sum==(arr[i]+arr[j])){
					System.out.println(arr[i]+","+arr[j]);
				}
				else{
					sum= arr[i]+arr[j];
				}
				
			}
			
		}
	}
}
