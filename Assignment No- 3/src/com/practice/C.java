package com.practice;

public abstract class C extends  B {
	
	@Override
	void mul(int a,int b) {
		int c=a*b;
		System.out.println("Mult of 2 digit :"+c);
	}
	abstract void div(int a,int b);
}



