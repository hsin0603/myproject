package com.hsin.oo;

import java.util.Scanner;

public class VendingMechine {

	public static void main(String[] args) {
		Drink d1 = new Drink("a",15);
		Drink d2 = new Drink("b",20);
		Drink d3 = new Drink("c",30);
//		Drink[] drinks = new Drink[3];
//		drinks[0]  = new Drink("a",15);
//		drinks[1]  = new Drink("b",20);
//		drinks[2]  = new Drink("c",30);
		int sum = 0;
		for(int i=1;i>=1;i++) {
		System.out.println("投入金額:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		sum = sum + n;
		System.out.println("已投入金額:"+sum);
		if(sum>100){
			break;
		}
		}

	}

}
