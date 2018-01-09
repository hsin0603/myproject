package com.hsin.sogo;

public class GoldenCustomer extends Customer {

	public GoldenCustomer(int amount){
		super(amount);
		super.discount = 0.1f;
	}
		@Override
		 public void print(){
	    	int total = (int)(amount*(1-discount));
	    	int returnMoney = (int)(amount*0.1f);
	    	System.out.println(amount+"\t"+total+"\t"+returnMoney);
	    }
	
	}
	

