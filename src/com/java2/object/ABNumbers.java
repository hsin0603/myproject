package com.java2.object;

public class ABNumbers {
	String number;
	int result = 0 ;
	public ABNumbers(String number) {
		this.number = number;
	}
	
	public int validate(String secret) {
	
	int length = secret.length();
		for (int i = 0; i < length; i++) {
			char c = secret.charAt(i);
			for (int j = 0; j < length; j++) {
				if (c == number.charAt(j)) {
					if (i == j) {
						result = result + 10;
					} else {
						result = result + 1;
					}
				}
			}

		}return result;
	}

}
