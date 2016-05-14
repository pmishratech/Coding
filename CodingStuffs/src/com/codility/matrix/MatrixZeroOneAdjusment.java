package com.codility.matrix;

public class MatrixZeroOneAdjusment {

	public static void main(String... args) {
		int[][] matrix = { { 0, 1, 1 }, { 0, 0, 0 }, { 1, 0, 0 } };

		int row[] = new int[matrix.length];
		int col[] = new int[matrix[0].length];
				
		System.out.println("======");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matrix[i][j] == 1) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (row[i] == 1 || col[j] == 1) {
					matrix[i][j] = 1;
				}
			}
		}
	}
}
