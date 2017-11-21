package com.hsin;

import java.util.Scanner;

public class GameTaster {

	public static void main(String[] args) {
		// while(true){
		// for (int i = 1; i > 0; i++) {
		int n = -1;
		while (n != 0) {
			System.out.print("請使用者輸入方向:");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			n = Integer.parseInt(line);
			switch (n) {
			case 8:
				System.out.println("向上");
				break;
			case 4:
				System.out.println("向左");
				break;
			case 6:
				System.out.println("向右");
				break;
			case 2:
				System.out.println("向下");
				break;
			case 0:
				System.out.println("Bye");
				break;
			default:
				System.out.println("錯誤");
			}
		}
		// if (n == 0) {
		// break;
	}

}
