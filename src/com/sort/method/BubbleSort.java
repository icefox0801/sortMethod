package com.sort.method;

import com.sort.common.SortSuperClass;
import com.sort.publicinterface.SortingInterface;

/**
 * bubble sorting method
 * 
 * @author ZhJF
 * @version 1.0
 */

public class BubbleSort extends SortSuperClass implements SortingInterface {

	/**
	 * Construct method
	 * 
	 * @param arr
	 *            the array to be sorted
	 */

	public BubbleSort(int[] arr) {
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
		int maxKey = Arr[0];
		for (int j = Arr.length - 1; j >= 1; j--) {
			for (int i = 0; i <= j - 1; i++) {
				if (Arr[i] > Arr[i + 1]) {
					maxKey = Arr[i];
					Arr[i] = Arr[i + 1];
					Arr[i + 1] = maxKey;
					count++;
				}

			}
		}

		return Arr;
	}

	@Override
	public int[] sort(int n) {
		// TODO Auto-generated method stub
		return null;
	}
}
