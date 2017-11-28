package com.hsin;

public class BubbleSort {

	public static void main(String[] args) {
		// {51,23,6,65,15}
		int n[] = {51,23,6,65,15};
		for (int i = 0; i < n.length; i++) {
			for(int x = 1;x <n.length;x++){
			if (n[i] > n[i + x]) {
				int tmb = n[i];
				n[i] = n[i + x];
				n[i + x] = tmb;
				
			}else{
				break;
			}
			}
		}
		}

	}


