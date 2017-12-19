package com.ibm;

public class NineLazy {

	public static void main(String[] args) {
	 for(int a=1;a<=9;a++){
		for(int i=2;i<=9;i++){
		System.out.print(i+"*"+a+"=");
		if((a * i) < 10){
			System.out.print(" "+(a*i)+"\t");
		}else{
			System.out.print((a*i)+"\t");
		}
	 
	}System.out.println("");
	 }
	}
}
