package com.sort.method;

import com.sort.common.SortSuperClass;
import com.sort.publicinterface.SortingInterface;

/**
 * merge sorting method
 * 
 * @author ZhJF
 * @version 1.0
 */

public class MergeSort extends SortSuperClass implements SortingInterface {

	private final int[] Arr;

	/**
	 * Construct method
	 * 
	 * @param arr
	 *            the array to be sorted
	 */

	public MergeSort(int[] arr) {
		this.Arr = arr;
	}

	/**
	 * The MergeSortMethod is a recursion method. By calling this method in
	 * recursion, the original sequence can be devided into unit sequence. And
	 * the minimum unit is a piece in order,then we call the Merge method in
	 * recursion
	 * 
	 * @return the array sorted
	 */

	public void MergeSortMethod(int m, int n) {
		int k;
		if (m < n) {
			k = (m + n) / 2;
			MergeSortMethod(m, k);
			MergeSortMethod(k + 1, n);
			Merge(m, k, n);
		}
		// return Arr;
	}

	/**
	 * a process to merge to sequence in order in a sequence in order, after
	 * calling this method the property of loop invariant is kept.
	 * 
	 * @param l
	 *            Start index
	 * @param m
	 *            Separate index
	 * @param n
	 *            End index
	 */
	public void Merge(int l, int m, int n) {

		int lenL = m - l + 1;
		int lenR = n - m;

		int[] ArrL = new int[lenL + 1];
		int[] ArrR = new int[lenR + 1];

		int i;
		int j;

		for (i = 0; i <= lenL - 1; i++) {
			ArrL[i] = Arr[l + i];
		}

		for (j = 0; j <= lenR - 1; j++) {
			ArrR[j] = Arr[m + 1 + j];
		}

		ArrL[lenL] = (int) Float.POSITIVE_INFINITY;
		ArrR[lenR] = (int) Float.POSITIVE_INFINITY;

		i = 0;
		j = 0;

		for (int p = l; p <= n; p++) {
			if (ArrL[i] <= ArrR[j]) {
				Arr[p] = ArrL[i];
				i++;
			} else {
				Arr[p] = ArrR[j];
				j++;
			}
			count++;
		}
	}

	@Override
	public int[] sort() {

		MergeSortMethod(0, Arr.length - 1);
		return Arr;
	}

	@Override
	public int[] sort(int n) {
		// TODO Auto-generated method stub
		return null;
	}
}
