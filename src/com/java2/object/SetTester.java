package com.java2.object;

import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTester {

	public static void main(String[] args) {
		Set<String> nameSet = new TreeSet<>(Arrays.asList("6","postgres","sqlite","oracle","mongodb","postgres","mssql"));
nameSet.remove(0);
		for(String set:nameSet){
	System.out.println(set);
}
	

	}

}
