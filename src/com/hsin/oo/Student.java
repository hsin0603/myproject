package com.hsin.oo;

public class Student {
	int english;
	int math;
	int chinese;
	String name;
// 屬性 instance variable
	public Student(String name,int english,int math,int chinese){
		this.english = english;
	    this.math = math;
		this.chinese = chinese;
		this.name = name;
	}
	
	public Student(String name){
		this.name = name;
	}

	public void print() {
		System.out.println(english + "\t" + math + "\t" + chinese);
	}

	public int gitAverage() {
		return (english + math + chinese) / 3;
	}
}
