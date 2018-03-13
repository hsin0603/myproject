package com.hsin.sogo;

public class GoBackTicket extends Ticket {
	String backdate;
	String backtime;
	public GoBackTicket (String date, String time,String backdate,String backtime ,String start, String end, int money) {
	this.backdate = backdate;
	this.backtime = backtime;
	}
	@Override
	public void print() {
		System.out.println(date + "\t" + time + "\t" + start + "\t" + end + "\t" + money+"(來回票)");
	}
}
