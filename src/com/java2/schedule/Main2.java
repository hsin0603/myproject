package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
	List<Course> courses = new ArrayList<>();

	public void sc() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入星期(1-7):");
		int w = scanner.nextInt();
		System.out.println("請輸入時(0-24):");
		int t = scanner.nextInt();

	}

	public void readCourses() {
		try {
			FileReader fr;
			fr = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(fr);
			String line;
			List<String> id = new ArrayList<>();
			List<String> name = new ArrayList<>();
			List<Integer> weekday = new ArrayList<>();
			List<Integer> time = new ArrayList<>();
			List<Integer> hour = new ArrayList<>();
			for (int i = 0; i < 4; i++) {
				line = in.readLine();
				String[] tokens = line.split(",");
				id.add(tokens[0]);
				name.add(tokens[1]);
				weekday.add(Integer.parseInt(tokens[2]));
				time.add(Integer.parseInt(tokens[3]));
				hour.add(Integer.parseInt(tokens[4]));
			}
			line = in.readLine();
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("請輸入星期(1-7):");
			int w = scanner.nextInt();
			System.out.println("請輸入時(0-24):");
			int t = scanner.nextInt();
			switch (w) {
			case 1:
				int s = 2;
				if (time.get(s) <= t && t <= (time.get(s) + hour.get(s))) {
					System.out.println(
							"[有課:" + id.get(s) + " " + name.get(s) + " 到" + (time.get(s) + hour.get(s)) + "時]");
					break;
				} else {
					System.out.println("[有空檔]");
					break;
				}

			case 2:
				int s1 = 0;
				if (time.get(s1) <= t && t <= (time.get(s1) + hour.get(s1))) {
					System.out.println(
							"[有課:" + id.get(s1) + " " + name.get(s1) + " 到" + (time.get(s1) + hour.get(s1)) + "時]");
					break;
				} else {
					System.out.println("[有空檔]");
					break;
				}
			case 4:
				int s11 = 1;
				int s12 = 3;
				if (time.get(s11) <= t && t <= (time.get(s11) + hour.get(s11))) {
					System.out.println(
							"[有課:" + id.get(s11) + " " + name.get(s11) + " 到" + (time.get(s11) + hour.get(s11)) + "時]");
					break;
				} else {
					if (time.get(s12) <= t && t <= (time.get(s12) + hour.get(s12))) {

						System.out.println("[有課:" + id.get(s12) + " " + name.get(s12) + " 到"
								+ (time.get(s12) + hour.get(s12)) + "時]");
						break;
					} else {
						System.out.println("[有空檔]");
						break;
					}

					
				}

			default:
				System.out.println("[有空檔]");
				break;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Main2 m = new Main2();
		m.readCourses();

	}

}
