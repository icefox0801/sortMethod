package com.sort.sortable.method;

import com.sort.common.SortSuperClass;
import com.sort.sortable.Sortable;

public class QuickSort extends SortSuperClass implements Sortable {

	/**
	 * construct method
	 * 
	 * @param arr
	 *            the array to be sorted
	 */
	public QuickSort(int[] arr) {
		setArr(arr);
	}

	/**
	 * method to find out the the position for the last element(key element)
	 * 
	 * @param arr
	 *            the array to be sorted
	 * @param p
	 *            the start index of array
	 * @param r
	 *            the end index of array
	 * @return the position in which the last element(key element) should be
	 *         inserted
	 */
	public int partition(int[] arr, int p, int r) {
		int x = arr[r];
		int i = p - 1;
		int temp;
		for (int j = p; j != r; j++) {
			if (arr[j] <= x) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			count++;
		}
		temp = arr[i + 1];
		arr[i + 1] = arr[r];
		arr[r] = temp;
		return i + 1;
	}

	/**
	 * quick sort method
	 * 
	 * @param arr
	 *            the array to be sorted
	 * @param p
	 *            the start index of array
	 * @param r
	 *            the end index of array
	 */

	public void quickSort(int[] arr, int p, int r) {
		if (p < r) {
			int q = partition(arr, p, r);
			quickSort(arr, p, q - 1);
			quickSort(arr, q + 1, r);
		}
	}

	@Override
	public int[] sort(int n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] sort() {
		int[] Arr = getArr();
		quickSort(Arr, 0, Arr.length - 1);
		return Arr;
	}

}
