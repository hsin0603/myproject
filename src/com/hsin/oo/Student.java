package com.hsin.oo;

import java.lang.Thread.State;

public class Student {
	int english;
//	private 限制東西只能用在自己
	protected int math;
//	可以用在繼承跟同package的東西上
	int chinese;
	String name;
	static int pass = 60;
//	static 類別層級的變數 只取static層級用
// 屬性 instance variable
// 有加public才能用在別的package
	public Student(){
		
	}
//	空建構值(有才可繼承)
	
	public Student(String name,int english,int math,int chinese){
		this.english = english;
	    this.math = math;
		this.chinese = chinese;
		this.name = name;
	}
	
	public static void method() {
		System.out.println("hello");
	}
	
	public Student(String name){
		this.name = name;
	}

	public void print() {
		System.out.println(pass);
		System.out.println(english + "\t" + math + "\t" + chinese);
	}

	public int gitAverage() {
		return (english + math + chinese) / 3;
	}
}
