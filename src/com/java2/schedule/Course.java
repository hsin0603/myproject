package com.java2.schedule;

public class Courses {
	String id;
	String name;
	int weekday;
	int time;
	int hour;

	
	public Courses(String id, String name, int weekday, int time, int hour) {
		super();
		this.id = id;
		this.name = name;
		this.weekday = weekday;
		this.time = time;
		this.hour = hour;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeekday() {
		return weekday;
	}

	public void setWeekday(int weekday) {
		this.weekday = weekday;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

}