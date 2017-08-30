package org.karanki.play.coding.system_design.cache;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CacheTest {

	private Cache testObject;
	
	@Before
	public void setUp() {		
		testObject = new ConcreteCache();
	}
	
	
	@Test
	public void testPut() {		
		
		Long ID = new Long(1);
		String value = "Koti R. Karanki";
		
		testObject.put(new Long(1), value);
		String newValue =  (String) testObject.get(ID);		
		assertEquals(value, newValue);
		
		
		testObject.put(new Long(2), "Peddi Karanki");
		testObject.put(new Long(3), "Rigved R.S. Karanki");
		
		newValue =  (String) testObject.get(3);
		
		assertEquals("Rigved R.S. Karanki", newValue);
				
				
	}
	
	
	
	@After
	public void tearDown() {
		
		testObject = null;
	}
}
