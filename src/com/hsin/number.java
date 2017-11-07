package com.hsin;

public class number {

	public static void main(String[] args) {
		for (int n = 1; n <= 9; n++) {
			for (int i = 2; i <= 5; i++) {
				if ((n * i) < 10) {
					System.out.print(i + " x " + n + " =  " + (n * i) + "\t");
				} else {
					System.out.print(i + " x " + n + " = " + (n * i) + "\t");
				}
			}
			System.out.println();
		}
	}
}
