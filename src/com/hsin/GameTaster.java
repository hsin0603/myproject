package com.hsin;

import java.util.Scanner;

public class GameTaster {

	public static void main(String[] args) {
		// while(true){
		// for (int i = 1; i > 0; i++) {
		int n = -1;
		int pos = 0;
		int row = 3;
		int col = 5;
		int hp = 100;
		while (hp >= 0) {
			System.out.print("請使用者輸入方向:");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			n = Integer.parseInt(line);
			switch (n) {
			case 8:
				if(pos / col > row-2){
					pos = pos - col;
				System.out.println("向上");
				hp = hp - 5;
				}else{
					System.out.println("撞牆");
					hp = hp - 30;
				}
				System.out.println("地點:" + pos);
				System.out.println("hp:" + hp);
					break;
				
			case 4:
				if(pos % col != 0){
					pos = pos - 1;
				System.out.println("向左");
				hp = hp - 5;
				}else{
					System.out.println("撞牆");
					hp = hp - 30;
				}
				System.out.println("地點:" + pos);
				System.out.println("hp:" + hp);
				break;
			case 6:
				if(pos % col != col - 1){
					pos = pos + 1;
				System.out.println("向右");
				hp = hp - 5;
				}else{
					System.out.println("撞牆");
				hp = hp - 30;
				}	
				System.out.println("地點:" + pos);
				System.out.println("hp:" + hp);
				break;
			case 2:
				if(pos/col < row-1){
			    pos = pos + col;
				System.out.println("向下");
				hp = hp - 5;
				}else{
					System.out.println("撞牆");
					hp = hp - 30;
				}
				System.out.println("地點:" + pos);
				System.out.println("hp:" + hp);
				break;
			case 0:
				System.out.println("Bye");
				break;
			default:
				System.out.println("錯誤");
			}
		}
		System.out.println("遊戲結束");
		System.out.println("地點:" + pos);
		System.out.println("hp:" + hp);
		// if (n == 0) {
		// break;
	}

}
