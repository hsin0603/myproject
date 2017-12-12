package com.hsin.oo;

public class Taster {

	public static void main(String[] args) {
    	Student stu = new Student("王小明", 55, 66, 77);
//		Student stu = new Student("王小明");
		// stu.english = 55;
		// stu.math = 66;
		// stu.chinese = 77;
		stu.print();
		int avg = stu.gitAverage();
		System.out.println(stu.name + ":" + avg);
	}
}
