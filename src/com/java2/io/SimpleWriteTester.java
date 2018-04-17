package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SimpleWriteTester {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream out = new PrintStream("data.txt");
		out.println("Amy Weng\t1\t2000");
		out.flush();
//		確認緩衝資料送出去
		out.close();
//		關閉資料流

	}

}
