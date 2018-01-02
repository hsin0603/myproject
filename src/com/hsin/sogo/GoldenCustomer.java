package com.hsin.sogo;

public class GoldenCustomer extends Customer {

	public GoldenCustomer(int amount){
		super(amount);
		super.discount = 0.1f;
	}
		@Override
		 public void print(){
	    	int total = (int)(amount*(1-discount));
	    	System.out.print(amount+"\t"+total+"\t"+(int)(amount*0.1f));
	    }
	
	}
	

