package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
	public void sc() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入星期(1-7):");
		int w = scanner.nextInt();
		System.out.println("請輸入時(0-24):");
		int t = scanner.nextInt();
	}

	public void readCourses() {
		FileReader fr;
		try {
			fr = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(fr);
			String line;
			line = in.readLine();
			String[] tokens = line.split(",");
			List<String> courses = new ArrayList<>();
			for(int i = 0 ;i<tokens.length;i++) {
				courses.add(tokens[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
