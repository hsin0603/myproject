package com.java2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poker2 {
	Random random = new Random();
	List<Integer> cards = new ArrayList<Integer>();
	String flowers = "SHDC";

	public Poker2() {
		for (int i = 0; i < 52; i++) {
			cards.add(i+1);
			System.out.println((i%13)+1+""+(flowers.charAt(i/13)));
		}
	}
	public void shuffle2(){
		for(int a =0;a<52;a++){
			int r =random.nextInt(52);
			cards.set(a, r);
		}
	}
}
