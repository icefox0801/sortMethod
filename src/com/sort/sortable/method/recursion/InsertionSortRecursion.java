package com.sort.sortable.method.recursion;

import com.sort.common.SortSuperClass;
import com.sort.sortable.Sortable;

/**
 * Insertion sorting method of recursion version
 * 
 * @author ZhJF
 * @version 1.0
 */
public class InsertionSortRecursion extends SortSuperClass implements Sortable {

	private int temp = 0;
	private final int[] Arr;

	/**
	 * sorting method
	 * 
	 * @param n
	 *            the times for the recursion algorithm
	 * @return the array sorted
	 */
	@Override
	public int[] sort(int n) {
		if (n >= 0) {
			if (n == Arr.length - 1)
				sort(n - 1);
			else if (Arr[n] > Arr[n + 1]) {
				temp = Arr[n];
				Arr[n] = Arr[n + 1];
				Arr[n + 1] = temp;
				sort(n + 1);
			} else
				sort(n - 1);
		}
		return Arr;
	}

	/**
	 * construct method
	 * 
	 * @param Arr
	 */

	public InsertionSortRecursion(int[] Arr) {
		this.Arr = Arr;
	}

	@Override
	public int[] sort() {
		// TODO Auto-generated method stub
		return null;
	}
}
