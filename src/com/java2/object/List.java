package com.java2.object;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		java.util.List<Integer> cards = new ArrayList<>();
		cards.add(0);
		cards.add(1);
		cards.add(9);
		System.out.println("removing number:" + cards.remove(0));
		System.out.println(cards.size());
		System.out.println(cards.get(1));
		cards.set(1,5);
		System.out.println(cards.get(1));

	}

}
