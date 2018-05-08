package com.java2.object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Taster2 {
public static void main(String[] args) {
	List<Integer> numList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
	for(int i = 0 ; i<5 ; i++)
	numList.remove(i);
	System.out.println(numList);
  }
		}
  
		
