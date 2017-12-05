package com.hsin;

public class ScoreAray {

	public static void main(String[] args) {
		int score[][] = new int[5][3];
		score[0][0] = 11;
		score[0][1] = 22;
		score[0][2] = 33;
		score[1][0] = 55;
		score[1][1] = 44;
		score[1][2] = 33;
		score[2][0] = 99;
		score[2][1] = 66;
		score[2][2] = 88;
		score[3][0] = 55;
		score[3][1] = 77;
		score[3][2] = 22;
		score[4][0] = 99;
		score[4][1] = 66;
		score[4][2] = 33;
		for (int i = 0; i < 5; i++) {
			System.out.print(score[i][0] + "\t" + score[i][1] + "\t" + score[i][2] + "\t");
			int a = ((score[i][0] + score[i][1] + score[i][2]) / 3);
			if (a < 60) {
				System.out.println(a + "*");
			} else {
				System.out.println(a);
			}
		}
	}

}
