package com.tddBasic2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {
	Factorial f1=new Factorial();
	@Test
	public void test_factorial_number() {
		
		assertEquals(f1.fact(5), 120);
	}
	@Test
	public void test_factorial_number2() {

		assertEquals(f1.fact(6), 110);
	}
}
