package com.hsin;

public class BubbleSort {

	public static void main(String[] args) {
		// {51,23,6,65,15}
		int n[] = { 51, 23, 6, 65, 15 };
//		for (int a = 0; a <= n.length-1; a++)
		for (int a = 0; a <= 4; a++) {
//			for (int i = a + 1; i <= n.length; i++)
			for (int i = a + 1; i <= 4; i++) {
				if (n[a] > n[i]) {
					int tmp = n[i];
					n[i] = n[a];
					n[a] = tmp;
				}
			}
			System.out.print(n[a] + " ");
		}
}
//for(int num:n){
//	System. out.print(num +" ")}
}
