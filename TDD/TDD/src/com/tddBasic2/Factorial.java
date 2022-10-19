package com.tddBasic2;

public class Factorial {
	public int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {

			fact = fact * i;
		}
		// System.out.println(fact);
		return fact;
	}
}
