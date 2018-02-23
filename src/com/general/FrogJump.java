package com.general;

public class FrogJump {

	public static void main(String[] args) {
		FrogJump obj = new FrogJump();
		int minJumps = obj.solution(10, 85, 30);
		System.out.println(minJumps);
	}

	private int solution(int X, int Y, int D) {
		int numberOfJumps = 0;

		if ((Y - X) < D) {
			numberOfJumps = 1;
		}
		if ((Y - X) % D == 0) {
			numberOfJumps = (Y - X) / D;
		} else {
			numberOfJumps = ((Y - X) / D) + 1;
		}

		return numberOfJumps;
	}
}
