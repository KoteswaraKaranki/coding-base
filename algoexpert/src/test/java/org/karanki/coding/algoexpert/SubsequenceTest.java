package org.karanki.coding.algoexpert;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SubsequenceTest {

	@Test
	public void testValidSubsequence() {
		assertTrue(Subsequence.validSubsequence(new int[] {15, 6, 12, 8, 14, 3, 11}, new int[] {6, 8}));
		assertTrue(Subsequence.validSubsequence(new int[] {15, 6, 12, 8, 14, 3, 11}, new int[] {15}));
		assertTrue(Subsequence.validSubsequence(new int[] {15, 6, 12, 8, 14, 3, 11}, new int[] {6, 12}));
		assertTrue(Subsequence.validSubsequence(new int[] {15, 6, 12, 8, 14, 3, 11}, new int[] {15, 6, 12, 8, 14, 3, 11}));
		assertTrue(Subsequence.validSubsequence(new int[] {15, 6, 12, 8, 14, 3, 11}, new int[] {11}));
		assertTrue(Subsequence.validSubsequence(new int[] {15, 6, 12, 8, 14, 3, 11}, new int[] {8, 3}));
		assertFalse(Subsequence.validSubsequence(new int[] {15, 6, 12, 8, 14, 3, 11}, new int[] {8, 15}));
		assertFalse(Subsequence.validSubsequence(new int[] {15, 6, 12, 8, 14, 3, 11}, new int[] {22}));
		assertFalse(Subsequence.validSubsequence(new int[] {15, 6, 12, 8, 14, 3, 11}, new int[] {15, 6, 12, 8, 14, 3, 11, 39}));
	}
}
