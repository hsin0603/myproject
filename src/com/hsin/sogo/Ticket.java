package com.hsin.sogo;

public class Ticket {
	String date;
	String time;
	String start;
	String end;
	int money;

	public Ticket(String date, String time, String start, String end, int money) {
		this.date = date;
		this.time = time;
		this.start = start;
		this.end = end;
		this.money = money;
	}

	public void print() {
		System.out.println(date + "\t" + time + "\t" + start + "\t" + end + "\t" + money+"(一般票)");
	}

}
