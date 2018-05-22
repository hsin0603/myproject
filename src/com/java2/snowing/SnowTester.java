package com.java2.snowing;

import java.util.ArrayList;
import java.util.List;

public class SnowTester {

	public static void main(String[] args) {
		List<Snow> list = new ArrayList<>();
		for(int i =0;i<100;i++){
		Snow snow = new Snow();
		snow.start();
		list.add(snow);
		}
	}

}
