package com.hsin.sogo;

import java.util.ArrayList;
import java.util.Random;

import javax.crypto.AEADBadTagException;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(new Customer(10000));
		customers.add(new SilverCustomer(10000));
		customers.add(new GoldenCustomer(10000));
		for (int i = 0; i < customers.size(); i++) {
			customers.get(i).print();
		}

		ArrayList<Integer> list = new ArrayList();
		// List<Integer> list = new ArrayList<>();
		// 父類別的參照資料型態可以放(給值)子類別的物件
		// <>泛型語法-限制放同質性的東西，放不同的要轉型。
		list.add(94);
		list.add(87);
		list.add(55);
		list.add(6);
		int a = list.get(2);
		list.remove(2);
		System.out.println(list.get(1));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
//		洗牌*********
		int n[] ={1,2,3,4,5,6,7,8,9,10};
		for(int x= 0;x < n.length;x++){
			Random random = new Random();
			int r = random.nextInt((n.length)-1);
			int e = n[0];
			n[0] = n[r];
			n[r] = e;
			System.out.print(n[x]);
			
		}
		

	}

}
