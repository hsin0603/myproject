package com.hsin;

import java.util.Scanner;

public class DateOfYear {

	public static void main(String[] args) {
		System.out.print("輸入天數:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		int a[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < a.length; i++) {
			if (n < a[i]) {
				System.out.print((i + 1) + "/" + n);
				break;
			} else {
				n = n - a[i];
			}
		}

	}

}
