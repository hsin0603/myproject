package com.hsin;

import java.util.Scanner;

public class question {

	public static void main(String[] args) {
	  System.out.println("以下誰年紀最大?");
	  System.out.println("1) 周杰倫");
	  System.out.println("2) 華晨宇");
	  System.out.println("3) 梁朝偉");
	  Scanner scanner = new Scanner (System.in);
	  String line = scanner.nextLine();
	  int a = Integer.parseInt(line);
	  System.out.println(a);
	  if(a == 3){
		  System.out.println("正確");
	  }else{
		  System.out.println("錯誤");
	  }
	}

}
