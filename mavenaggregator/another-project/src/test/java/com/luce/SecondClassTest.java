package com.luce;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SecondClassTest {
	
	@Test
	public void testGetClassName() {
		SecondClass sc = new SecondClass();
		assertEquals("SecondClass", sc.getClassName());
	}

}
