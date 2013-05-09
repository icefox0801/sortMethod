package com.sort.method;

import java.util.Random;

import com.sort.publicinterface.SortingInterface;

public class RandomizedQuickSort extends QuickSort implements SortingInterface {

	/**
	 * construct method
	 * 
	 * @param arr
	 *            the array to be sorted
	 */
	public RandomizedQuickSort(int[] arr) {
		super(arr);
		// TODO Auto-generated constructor stub
	}

	/**
	 * method to find out the the position for the last element(key element) ----randomized version
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
	@Override
	public int partition(int[] arr, int p, int r) {
		Random ran = new Random();
		int n = ran.nextInt(r - p) + p;
		int temp = arr[n];
		arr[n] = arr[r];
		arr[r] = temp;
		return super.partition(arr, p, r);
	}

}
