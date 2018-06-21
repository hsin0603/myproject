package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.ietf.jgss.GSSCredential;

import com.java2.oo.Drink;

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
	List<Course> courses = new ArrayList<>();

	public Main() {
		readCourses();

	}

	public void readCourses() {
		FileReader fr;
		try {
			fr = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(fr);
			String line;
			Scanner scanner = new Scanner(System.in);
			System.out.println("請輸入星期(1-7):");
			int w = scanner.nextInt();
			System.out.println("請輸入時(0-24):");
			int t = scanner.nextInt();
			for (int i = 0; i < 5; i++) {
				line = in.readLine();
				String[] tokens = line.split(",");
				String id = tokens[0];
				String name = tokens[1];
				int weekday = Integer.parseInt(tokens[2]);
				int time = Integer.parseInt(tokens[3]);
				int hour = Integer.parseInt(tokens[4]);
				Course c = new Course(id, name, weekday, time, hour);
				if (c.weekday == w) {
					if (c.time <= t && t <= (c.time + c.hour)) {
						System.out.println("[有課:" + id + " " + name + " 到" + (time + hour) + "時]");
					    break;
					} else {
						System.out.println("[有空檔]");
						break;
					}
				}else {}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Main m = new Main();

	}
}
