package com.hsin.oo;

public class Student {
	int english;
	int math;
	int chinese;
	String name;
	
	public Student(String n,int e,int m,int c){
		english = e;
		math = m;
		chinese = c;
		name = n;
	}

	public void print() {
		System.out.println(english + "\t" + math + "\t" + chinese);
	}

	public int gitAverage() {
		return (english + math + chinese) / 3;
	}
}
