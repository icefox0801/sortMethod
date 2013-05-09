package com.sort.demo;

import com.sort.common.SortSuperClass;
import com.sort.method.QuickSort;
import com.sort.publicinterface.SortingInterface;
import com.sort.sortingtype.SortingType;
import com.sort.utils.RandomArray;

/**
 * demo for all sorting methods.
 * 
 * @author ZhJF
 * @version 1.0
 */

public class demo {

	/**
	 * @param args
	 *            symbol list
	 */
	public static void main(String[] args) {
		RandomArray ra = new RandomArray();
		final int[] A = ra.generate(1000000);
		SortingType st = new SortingType(); // change the argument to define a
											// different sorting method
		SortingInterface sm = new QuickSort(A);
		st.setSortMethod(sm);
		st.sort();
		/*
		 * for (int n = 0; n != A.length; n++) { System.out.print(A[n] + ">>>");
		 * }
		 */
		System.out.println(SortSuperClass.count + "****Quick Sort");
	}
}