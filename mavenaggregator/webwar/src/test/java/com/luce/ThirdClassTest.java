package com.luce;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThirdClassTest {
	
	@Test
	public void testGetClassName() {
		ThirdClass sc = new ThirdClass();
		assertEquals("ThirdClass", sc.getClassName());
	}

}
