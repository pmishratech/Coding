package com.codility.matrix;

public class MatrixRotation {
	public static void main(String[] args) {

		int[][] matrix = { { 7, 8, 9 }, 
						   { 4, 5, 9 }, 
						   { 2, 3, 4 } 
						 };
		int r1 = 0, r2 = 3, c1 = 0, c2 = 3;

		while (r1 < r2 && c1 < c2) {
			for (int i = c1; i < c2; i++) {
				System.out.println(matrix[r1][i]);
			}
			r1++;
			for (int i = r1; i < r2; i++) {
				System.out.println(matrix[i][c2-1]);
			}
			c2--;
			for (int i = c2-1; i >= c1; i--) {
				System.out.println(matrix[r2-1][i]);
			}
			r2--;
			for (int i = r2-1; i >= r1; i--) {
				System.out.println(matrix[i][c1]);
			}
			c1++;
		}
	}
}
