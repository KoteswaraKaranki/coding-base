package org.karanki.coding.string;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class StringUtilTest {

	
	IndexOfUniqueChar testObject;
	
	@Before
	public void setUp() {		
		testObject = new IndexOfUniqueChar();
	}
	
	
	@Test
	public void testIsUniqueCharSet1() {
		//index 'a' i.e. 0 to be returned
		assertEquals(0, testObject.indexOfNonDuplicateChar("abcdefghij"));		
	}
	
	@Test
	public void testIsUniqueCharSet2() {		
		//index 'e' i.e. 4 to be returned
		assertEquals(4, testObject.indexOfNonDuplicateChar("abcdefghijabcd"));		
	}
	
	@Test
	public void testIsUniqueCharSet3() {		
		//-1 to be returned as every character is duplicated
		assertEquals(-1, testObject.indexOfNonDuplicateChar("abcdefghijabcdefghij"));		
	}
	
	@Test
	public void testIsUniqueCharSet4() {		
		//x is not repeated here, so its index 23 to be returned
		assertEquals(23, testObject.indexOfNonDuplicateChar("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwyz"));		
	}
}
