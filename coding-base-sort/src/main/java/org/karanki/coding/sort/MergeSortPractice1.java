package org.karanki.coding.sort;

import java.util.Arrays;

public class MergeSortPractice1 {

	public void sort(int[] a) {
		sort(a, 0, a.length - 1);
	}

	private void sort(int[] a, int start, int end) {

		if (start >= end) {
			return;
		}

		int mid = (start + end) / 2;
		sort(a, start, mid);
		sort(a, mid + 1, end);
		merge(a, start, end);
	}

	private void merge(int[] a, int start, int end) {

		int len = end - start + 1;
		int tmp[] = new int[len];
		int mid = (end + start) / 2;
		int rightIdx = mid + 1;
		int tmpIndex = 0;
		int leftIdx = start;

		while (leftIdx <= mid && rightIdx <= end) {
			if (a[leftIdx] <= a[rightIdx]) {
				tmp[tmpIndex++] = a[leftIdx++];
				//leftIdx++;
			} else {
				tmp[tmpIndex++] = a[rightIdx++];
				//rightIdx++;
			}

			//tmpIndex++;
		}

		System.arraycopy(a, leftIdx, tmp, tmpIndex, mid - leftIdx + 1);
		System.arraycopy(a, rightIdx, tmp, tmpIndex, end - rightIdx + 1);
		System.arraycopy(tmp, 0, a, start, len);
	}

	public static void main(String[] args) {

		MergeSortPractice1 sort = new MergeSortPractice1();

		int[] a1 = { 10, 5, 4, 13, 25, 0, 2, 12, 1 };
		System.out.println("Before Sort : " + Arrays.toString(a1));
		sort.sort(a1);
		System.out.println("After Sort : " + Arrays.toString(a1));
		System.out.println("----------------------------------------");

		int[] a2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Before Sort : " + Arrays.toString(a2));
		sort.sort(a2);
		System.out.println("After Sort : " + Arrays.toString(a2));
		System.out.println("----------------------------------------");

		int[] a3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		System.out.println("Before Sort : " + Arrays.toString(a3));
		sort.sort(a3);
		System.out.println("After Sort : " + Arrays.toString(a3));

	}

}
