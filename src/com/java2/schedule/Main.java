package com.java2.schedule;

import java.util.Scanner;

/*有一文字檔儲存課表資料(schedule.txt)
請讀取資料後設計程式可檢查是否有空檔?
如:
請輸入星期(1-7):2
請輸入時(0-24):11
[有空檔]
請輸入星期(1-7):4
請輸入時(0-24):14
[有課: C004 English 到16時]
*/
public class Main {
	
	Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    int t =Integer.parseInt(line);
	
    public static void main(String[] args) {
        
        System.out.println("請輸入星期(1-7):");
        Main a = new Main();
	}

}
