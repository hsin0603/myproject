package com.java2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poker2 {
	Random random = new Random();
	List<Integer> cards2 = new ArrayList<Integer>();
	String flowers2 = "SHDC";

	public Poker2() {
		for (int i = 0; i < 52; i++) {
			cards2.add(i + 1);
			System.out.println((i % 13) + 1 + "" + (flowers2.charAt(i / 13)));
		}
	}

	public void shuffle2() {
		for (int i = 0; i < cards2.size(); i++) {
			int r = random.nextInt(52);
			int q = cards2.get(i);
			cards2.set(i, cards2.get(r));
			cards2.set(r, q);
			System.out.print(cards2.get(i) + " ");
		}
		System.out.println();
	}

	public void show2() {
		for (int i = 0; i < cards2.size(); i++) {
			int c = cards2.get(i);
			System.out.print((c % 13) + 1 + "" + (flowers2.charAt(c / 13) + " "));
			if ((i % 13) == 0) {
				System.out.println();
			}
		}
	}
}
