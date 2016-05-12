package com.codility;

public class MaximumSizeSubMatrix {

	public static void main(String... args) {
		int[][] matrix = { { 0, 1, 1 }, { 0, 1, 1 }, { 1, 0, 0 } };
		int[][] s_matrix = new int[3][3];

		int maximum, i_index_max=0, j_index_max=0;
		maximum = matrix[0][0];

		/* Set first column of S[][] */
		for (int i = 0; i < 3; i++)
			s_matrix[i][0] = matrix[i][0];

		/* Set first row of S[][] */
		for (int j = 0; j < 3; j++)
			s_matrix[0][j] = matrix[0][j];

		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 3; j++) {
				if (matrix[i][j] == 1) {
					s_matrix[i][j] = Math.min(Math.min(matrix[i][j - 1], matrix[i - 1][j]),
							matrix[i - 1][j - 1])+1;
				} else {
					s_matrix[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (s_matrix[i][j] > maximum) {
					maximum = s_matrix[i][j];
					i_index_max = i;
					j_index_max = j;
				}
			}
		}
		
		System.out.println("Maximum size sub-matrix is: \n");
	    for(int i = i_index_max; i > i_index_max - maximum; i--)
	    {
	        for(int j = j_index_max; j > j_index_max - maximum; j--)
	        {
	            System.out.print(matrix[i][j]+" ");
	        } 
	        System.out.println();
	    }  
	}
}
