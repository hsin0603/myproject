package com.hsin;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		System.out.print("請輸入一個數:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		for (int i = 1; i <= n; i++) {
			if ((i % 3) == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
