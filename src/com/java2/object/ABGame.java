package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
		String secret = "9873";
		for(int q=0;q>=0;q++){
			System.out.print("Please enter your guess:");
			Scanner scanner = new Scanner(System.in);
			String nume = scanner.nextLine();
			// String nume = "1356";
			// String nume = "3867";
			// String nume = "9478";
			// String nume = "5893";
			// String nume = "9371";
			int a = 0;
			int b = 0;
			int length = secret.length();
			for (int i = 0; i < length; i++) {
				char c = secret.charAt(i);
				for (int j = 0; j < length; j++) {
					if (c == nume.charAt(j)) {
						if (i == j) {
							a++;
						} else {
							b++;
						}
					}
				}

			}
			System.out.println(a + "A" + b + "B");
			if (a == 4) {
				System.out.println("CORRECT!");
				break;
			}
		}
	}

}
