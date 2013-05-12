package com.sort.sortable.method;

import com.sort.common.SortSuperClass;
import com.sort.sortable.Sortable;

/**
 * insertion sorting method
 * 
 * @author ZhJF
 * @version 1.0
 */

public class InsertionSort extends SortSuperClass implements Sortable {

	/**
	 * Construct method
	 * 
	 * @param arr
	 *            the array to be sorted
	 */

	public InsertionSort(int[] arr) {
		setArr(arr);
	}

	/**
	 * sorting method
	 * 
	 * @return the array sorted
	 */

	@Override
	public int[] sort() {
		int[] Arr = getArr();
		int key = -1;
		int i = 0;
		for (int j = 1; j < Arr.length; j++) {
			key = Arr[j];
			i = j - 1;
			while (i >= 0 && Arr[i] > key) {
				Arr[i + 1] = Arr[i];
				i--;
				count++;
			}
			count++;
			Arr[i + 1] = key;
		}
		return Arr;
	}

	@Override
	public int[] sort(int n) {
		// TODO Auto-generated method stub
		return null;
	}
}
