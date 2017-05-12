package org.karanki.coding.cci.string_array;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UniqueCharacterTest {

	
	UniqueCharacter testObject;
	
	@Before
	public void setUp() {		
		testObject = new UniqueCharacter();
	}
	
	@Test
	public void testIsUniqueCharSet1_OK() {		
		assertEquals(true, testObject.isUniqueCharSet("abcdefghij"));		
	}
	
	@Test
	public void testIsUniqueCharSet2_OK() {		
		assertEquals(true, testObject.isUniqueCharSet("abcdefghijB"));		
	}
	
	@Test
	public void testIsUniqueCharSet3_Fail() {		
		assertEquals(false, testObject.isUniqueCharSet("abcdefghijb"));		
	}
	
	
	@Test
	public void testisUniqueCharSetByBitVector1_OK() {		
		assertEquals(true, testObject.isUniqueCharSetByBitVector("abcdefghij"));		
	}
	
	
	@Test
	public void testIisUniqueCharSetByBitVector2_Fail() {		
		assertEquals(false, testObject.isUniqueCharSetByBitVector("abcdefghijb"));		
	}
	
}
