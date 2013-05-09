package com.sort.method;

import com.sort.common.SortSuperClass;
import com.sort.publicinterface.SortingInterface;

/**
 * selection sorting method
 * 
 * @author ZhJF
 * @version 1.0
 */

public class SelectionSort extends SortSuperClass implements SortingInterface {

	/**
	 * Construct method
	 * 
	 * @param arr
	 *            the array to be sorted
	 */

	public SelectionSort(int[] arr) {
		setArr(arr);
	}

	/**
	 * sorting method
	 * 
	 * @return the array sorted
	 */

	@Override
	public int[] sort() {
		int[] Arr = this.getArr();
		int minKey = 0;
		int flag = 0;
		for (int j = 0; j < Arr.length - 1; j++) {
			minKey = Arr[j];
			flag = j;
			for (int i = j; i < Arr.length - 1; i++) {
				flag = minKey <= Arr[i + 1] ? flag : i + 1;
				minKey = minKey <= Arr[i + 1] ? minKey : Arr[i + 1];
				count++;
			}
			/* put the minimum number in the front end of the array */
			Arr[flag] = Arr[j];
			Arr[j] = minKey;

		}
		return Arr;
	}

	@Override
	public int[] sort(int n) {
		// TODO Auto-generated method stub
		return null;
	}
}
