package com.hsin;

public class bubble {

	public static void main(String[] args) {
		int n[] = { 31, 23, 43, 12, 55 };
		for (int a = 0; a <= 4; a++) {
			for (int i = a + 1; i <= 4; i++) {
				if (n[a] > n[i]) {
					int tmb = n[i];
					n[i] = n[a];
					n[a] = tmb;
				}
			}
			System.out.print(n[a] + " ");
		}

	}

}
