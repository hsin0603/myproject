package com.java2.object;

public class Food {
	int money;
	String food;
	private int calories;

	public Food(String food,int money) {
		this.money = money;
		this.food = food;
	}
	public void print(){
		System.out.println(food + ":" + money+"元");
	}
	private void printout(){
		System.out.println(food + ":" + calories);
	}
}