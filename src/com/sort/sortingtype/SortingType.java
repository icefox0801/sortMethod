package com.sort.sortingtype;

import com.sort.publicinterface.SortingInterface;

/**
 * this class provide method to the type of sorting
 * 
 * @author ZhJF
 * @version 1.0
 */

public class SortingType {
	private SortingInterface sortMethod;

	/**
	 * @return the type of sorting
	 */

	public SortingInterface getSortMethod() {
		return sortMethod;
	}

	/**
	 * set the type of sorting
	 * 
	 * @param sortMethod
	 */
	public void setSortMethod(SortingInterface sortMethod) {
		this.sortMethod = sortMethod;
	}

	/**
	 * for the override of sort() method in different sorting method
	 */

	public int[] sort() {
		return sortMethod.sort();
	}

	public int[] sort(int n) {
		return sortMethod.sort(n);
	}
}
