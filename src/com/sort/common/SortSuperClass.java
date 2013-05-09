package com.sort.common;

/**
 * The common attributes and method for sorting methods
 * 
 * @author ZhJF
 * @version 1.0
 */

public class SortSuperClass {

	private int[] Arr;

	public static int count = 0;

	/**
	 * set the array to be sorted
	 * 
	 * @param arr
	 *            the array to be sorted
	 */

	public void setArr(int[] arr) {
		this.Arr = arr;
	}

	/**
	 * get the array to be sorted
	 * 
	 * @return the array to be sorted
	 */

	public int[] getArr() {
		return this.Arr;
	}
}
