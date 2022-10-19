package com.tddBasic7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {
BinaryEquant be=new BinaryEquant();
	
	@Test
	public void test_binary_equant() {
		assertEquals(be.findBinaryEquant(3), "0011");
	}
	@Test
	public void test_binary_equant1() {
		assertEquals(be.findBinaryEquant(8), "1000");
	}
}
