package com.java2.oo;

public class Drink {
	int id;
	String name;
	int price;

	public Drink(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;

	}

	public void setId(int id) {
        this.id = id ;
	}
	public void getId(){
		return;
	}
	public void setName(String name) {
        this.name = name ;
	}
	public void getName(){
		return;
	}
	public void setPrice(int price) {
        this.price = price ;
	}
	public void getPrice(){
		return;
	}
}
