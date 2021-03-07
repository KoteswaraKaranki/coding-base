package org.karanki.coding.algoexpert;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoNumsumTest {

	
	@Test
	public void testTwoNumSum() {
		assertArrayEquals(TwoNumberSum.twoNumSum(new int[]{5, 10, 20, -2, 8}, 3), new int[] {5, -2});
		assertArrayEquals(TwoNumberSum.twoNumSum(new int[]{5, 10, 20, -2, 8}, 8), new int[] {10, -2});
		assertArrayEquals(TwoNumberSum.twoNumSum(new int[]{5, 10, 20, -2, 8}, 30), new int[] {10, 20});
		assertArrayEquals(TwoNumberSum.twoNumSum(new int[]{5, 10, 20, -2, 8}, 1), new int[] {});
	}
	
}
