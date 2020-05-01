package org.karanki.coding.leetcode.median_2arrays;

class Solution {

	public double findMedianSortedArrays_1(int[] nums1, int[] nums2) {

		int p1 = 0, p2 = 0, tmpIdx = 0;
		int tmpArr[] = new int[nums1.length + nums2.length];

		while (p1 < nums1.length && p2 < nums2.length) {
			if (p1 < nums1.length && p2 < nums2.length) {
				if (nums1[p1] < nums2[p2]) {
					tmpArr[tmpIdx++] = nums1[p1++];
				} else {
					tmpArr[tmpIdx++] = nums2[p2++];
				}
			}
		}

		while (p1 < nums1.length) {
			tmpArr[tmpIdx++] = nums1[p1++];
		}

		while (p2 < nums2.length) {
			tmpArr[tmpIdx++] = nums2[p2++];
		}

		if (tmpArr.length == 1) {
			return tmpArr[0];
		}

		double modValue = 0;
		int modIdx = 0;
		modIdx = tmpArr.length / 2;

		if (tmpArr.length % 2 == 0) {
			modValue = (tmpArr[modIdx] + tmpArr[modIdx - 1]) / 2D;
		} else {
			modValue = tmpArr[modIdx];
		}

		// System.out.println(Arrays.toString(tmpArr));

		return modValue;
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int p1 = 0, p2 = 0, tmpIdx = 0;

		boolean isEven = (nums1.length + nums2.length) % 2 == 0;
		int modIdx = isEven ? ((nums1.length + nums2.length) / 2) - 1 : ((nums1.length + nums2.length) / 2);
		int mod1Val = 0, mod2Val = 0;
		int curVal = 0;
		boolean isFinished = false;

		while (p1 < nums1.length && p2 < nums2.length) {
			if (p1 < nums1.length && p2 < nums2.length) {
				if (nums1[p1] < nums2[p2]) {
					curVal = nums1[p1++];
				} else {
					curVal = nums2[p2++];
				}

				if (isEven) {
					if (tmpIdx == modIdx) {
						mod1Val = curVal;
					} else if (tmpIdx == modIdx + 1) {
						mod2Val = curVal;
						isFinished = true;
						break;
					}
				} else if (!isEven && tmpIdx == modIdx) {
					mod1Val = curVal;
					isFinished = true;
					break;
				}
				tmpIdx++;
			}
		}

		while (p1 < nums1.length && !isFinished) {
			curVal = nums1[p1++];
			
			if (isEven) {
				if (tmpIdx == modIdx) {
					mod1Val = curVal;
				} else if (tmpIdx == modIdx + 1) {
					mod2Val = curVal;
					isFinished = true;
					break;
				}
			} else if (!isEven && tmpIdx == modIdx) {
				mod1Val = curVal;
				isFinished = true;
				break;
			}
			
			tmpIdx++;
		}

		while (p2 < nums2.length && !isFinished) {
			curVal = nums2[p2++];
			
			if (isEven) {
				if (tmpIdx == modIdx) {
					mod1Val = curVal;
				} else if (tmpIdx == modIdx + 1) {
					mod2Val = curVal;
					isFinished = true;
					break;
				}
			} else if (!isEven && tmpIdx == modIdx) {
				mod1Val = curVal;
				isFinished = true;
				break;
			}

			tmpIdx++;
		}

		// System.out.println(Arrays.toString(tmpArr));

		if (isEven) {
			double retVal = (mod1Val + mod2Val) / 2D;
			return retVal;
		} else {
			return mod1Val;
		}

	}

	public static void main(String[] args) {
		
		System.out.println(new Solution().findMedianSortedArrays(new int[] { 1, 3}, new int[] { 2}));
		
		System.out.println(new Solution().findMedianSortedArrays(new int[] { 1, 3, 8, 12, 16, 36 }, new int[] { 2, 4, 7, 9, 17, 22, 26, 28 }));
	}
}