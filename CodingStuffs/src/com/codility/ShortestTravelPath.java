package com.codility;
import java.util.HashSet;
import java.util.Set;

public class ShortestTravelPath {
	public static void main(String[] args) {
		int[] A = { 0, 1, 0, 3, 2 };
		int[] B = { 7, 3, 7, 3, 1, 3, 4, 1 };//My test case
		int[] C = { 7, 3, 7, 3, 1, 4, 4, 1 };//My test case
		System.out.println(solution(A));
		System.out.println(solution(B));
		System.out.println(solution(C));
	}

	public static int solution(int[] A) {
		Set<Integer> totalElements = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			totalElements.add(A[i]);
		}
		Set<Integer> s = new HashSet<Integer>();
		int maxPath = A.length;
		int count = 0;
		int k = 0;

		for (int i = 0; i < A.length; i++) {
			s.add(A[i]);
			count++;
			if (s.size() == totalElements.size()) {
				if (maxPath >= count) {
					maxPath = count;
					s.clear();
					count = 0;
					i = k++;
				}
			}
		}
		return maxPath;
	}
}
