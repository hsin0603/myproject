package com.kao;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int price = 0;
       for(int i=0;i>=0;i++){	
		Drink d1 =new Drink();
		d1.printMoney();
		System.out.println(price);
		d1.print();
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
	switch (line) {
	case "1": 
		price=price+1;
		break;
	case "5": 
		price=price+5;
		break;
	case "10": 
		price=price+10;
		break;
	case "a": 
		price=price-15;
		if(price>0){
			System.out.println("DON!");
		}else{
			price=price+15;
			System.out.println("BEEP!");
		}
		break;
	case "b": 
		price=price-20;
		if(price>0){
			System.out.println("DON!");
		}else{
			price=price+20;
			System.out.println("BEEP!");
		}
		break;
	case "c": 
		price=price-30;
		if(price>0){
			System.out.println("DON!");
		}else{
			System.out.println("BEEP!");
			price=price+30;
		}
		break;
	case "0":
		price = price-1000000;
		break;
    default:
		break;
	}if(price<0){
		System.out.println("結束");
		break;
	}
	}

	}
}