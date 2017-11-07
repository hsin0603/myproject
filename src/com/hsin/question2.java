package com.hsin;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		/*
		 * 請使用者輸入一個數字，印出階梯形的星號 如:輸入6 結果 * ** *** **** ***** ******
		 */
		System.out.println("請輸入一個數字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		for (int i = 1; i <= n; i++) {
			System.out.println("*");
		}
	}

}
