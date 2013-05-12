package com.sort.sortingtype;

import com.sort.sortable.Sortable;

/**
 * this class provide method to the type of sorting
 * 
 * @author ZhJF
 * @version 1.0
 */

public class SortingType {
	private Sortable sortMethod;

	/**
	 * @return the type of sorting
	 */

	public Sortable getSortMethod() {
		return sortMethod;
	}

	/**
	 * set the type of sorting
	 * 
	 * @param sortMethod
	 */
	public void setSortMethod(Sortable sortMethod) {
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
