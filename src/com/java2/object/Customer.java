package com.java2.object;

public class Customer {
	String name;
	int spend;
    private String level;
    
    public Customer(String name, int spend){
    	this.name = name;
    	this.spend = spend;
    }
    public Customer(){
    	
    }
    private void printout (){
    	System.out.println(name + "\t" + level);
    }
    public void print (){
    	System.out.println(name + "\t" + spend);
    }
}
