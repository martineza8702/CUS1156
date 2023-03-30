package cus1156.lab5;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class CatListTest {
	private CatList list;
	private String color;
	

	@Before
	public void setUp() throws Exception {
		list = new CatList();
		color="orange";
	}

	@Test
	public void testAddCat() {
		list.addCat(new Cat("Joe", "orange"));
		list.addCat(new Cat("Fluffy", "calico"));
		assertEquals(list.getCatAtPos(0).getName(), "Joe");
		assertEquals(list.getCatAtPos(1).getName(), "Fluffy");
	}

	@Test
	public void testHowManyCats() {
		list.addCat(new Cat());
		list.addCat(new Cat());
		assertEquals(list.howManyCats(), 2);
		list.addCat(new Cat());
		assertEquals(list.howManyCats(), 3);
	}
	
	@Test
	public void testcountCatsByColor() 
	{
		
		list.addCat(new Cat("Fluffy", "calico"));
		list.addCat(new Cat("Luca", "orange"));
		list.addCat(new Cat("Joe", "orange"));
		list.addCat(new Cat("Jack", "calico"));
		int result = list.countCatsByColor(color);
		assertEquals(result,2);
	}
	
	@Test 
	public void testgetCatByName(){
			list.addCat(new Cat("Joe","orange"));
			list.addCat(new Cat("Fluffy", "calico"));
			assertEquals(list.getCatByName("Fluffy"),list.getCatAtPos(1));
	}
	@Test 
	public void failtestgetCatByName(){
			list.addCat(new Cat("Joe","orange"));
			list.addCat(new Cat("Fluffy", "calico"));
			assertEquals(list.getCatByName("Fluffy"),list.getCatAtPos(1));


}
}
