package com.java2.collection;

		import java.util.ArrayList;
		import java.util.HashSet;
		import java.util.List;
		import java.util.Map;
		import java.util.Set;
		import java.util.TreeMap;
		
		public class Tester {
		
		public static void main(String[] args) {
			List<Integer> list = new ArrayList<>();
				list.add(1);
				list.add(3);
				list.add(1);
			list.add(4);
			System.out.println(list);
				
				//Hash��Ƥ��i���� ���ƪ̱N�e�����ӧR��
				//Hash��Ƥ��Ƨ� �H�K��
				Set<Integer> set = new HashSet<>();
			set.add(3);
			set.add(1);
			set.add(4);
			System.out.println(set);
			Set<String> set2 = new HashSet<>();
			set2.add("Coco");
			set2.add("Ring");
			set2.add("Elisa");
			set2.add("Hsin");
			set2.add("Coco");
			System.out.println(set2);
				
				//tree��key�j�p�Ƨ�
				Map<String, String> stocks = new TreeMap<>();
				stocks.put("2330","TSMC" );
				stocks.put("2454","Mediatek" );
			stocks.put("2317","HonHai" );
				System.out.println(stocks);
		}
		
		

	}


