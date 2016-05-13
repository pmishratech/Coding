package com.codility;

public class MaximumRowIndexwithOne {

	public static void main(String... args) {
		int[][] matrix = { { 0, 1, 1 }, { 1, 1, 1 }, { 1, 0, 1 } };
		int max=0, index_max_row=0;
		
		for (int i = 0; i < 3; i++) {
			int index= indexOfFirstOne(matrix[i]);
			if(max<3-index){
				max=3-index;
				index_max_row=i;
			}
		}
		System.out.println(index_max_row);
	}

	private static int indexOfFirstOne(int[] arr) {
		int low=0, high= arr.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			
			if(arr[mid]==1 && (mid==0 || arr[mid-1]==0))
				return mid;
			else if(arr[mid]==0)
				low=mid+1;
			else
				high=mid-1;
		}
		return -1;
	}
}
