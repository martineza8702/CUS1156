package cus1156.lab5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CatTest {
	private Cat testCat;

	@Before
	public void setUp() throws Exception {
		testCat = new Cat("Frodo", "orange");
	}

	@Test
	public void testGetColor() {
		String color = testCat.getColor();
		assertEquals(color, "orange");
	}

	@Test
	public void testSetColor() {
		testCat.setColor("white");
		assertEquals(testCat.getColor(), "white");
	}

	@Test
	public void testGetName() {
		String nm = testCat.getName();
		assertEquals(nm, "Frodo");
	}

	@Test
	public void testSetName() {
		testCat.setName("Joe");
		assertEquals(testCat.getName(), "Joe");
	}

}
