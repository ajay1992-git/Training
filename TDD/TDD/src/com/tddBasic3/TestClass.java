package com.tddBasic3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {
EvenOdd eo=new EvenOdd();
	
	@Test
	public void test_even_odd_count() {
		assertEquals(eo.evenodd(542587545), "4 5");
	}
	
	@Test
	public void test_even_odd_count1() {
		assertEquals(eo.evenodd(53545), "4 5");
	}
}
