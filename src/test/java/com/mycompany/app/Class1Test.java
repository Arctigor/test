package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Class1Test {
	Class1 class1;
	@Before
	public void setUp() throws Exception {
		class1 = new Class1();
	}

	@Test
	public void testGetName() {
		assertEquals(class1.getName(), "name");
		
		//fail("Not yet implemented");
	}

}
