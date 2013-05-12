package com.sort.sortable.method;

import com.sort.common.SortSuperClass;
import com.sort.sortable.Sortable;

/**
 * bubble sorting method
 * 
 * @author ZhJF
 * @version 1.0
 */

public class HeapSort extends SortSuperClass implements Sortable {

	private int heapSize;

	private final int[] Arr;

	/**
	 * Construct method
	 * 
	 * @param arr
	 *            the array to be sorted
	 */

	public HeapSort(int[] arr) {
		this.Arr = arr;
	}

	/**
	 * method to maintain the max-heap property which assumes that the binary
	 * trees rooted at left-child and right-child are max-heaps
	 * 
	 * @param arr
	 *            the array to be sorted
	 * @param i
	 *            the index to obey max-heap property
	 */
	public void maxHeapify(int[] arr, int i) {
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int max = i;
		if (l < heapSize) {
			max = arr[l] > arr[i] ? l : i;
		}
		if (r < heapSize) {
			max = arr[r] > arr[max] ? r : max;
		}
		if (max != i) {
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
			count++;
			maxHeapify(arr, max);
		}
	}

	/**
	 * Method to build an array a max-heap
	 * 
	 * @param arr
	 *            the array to be sorted
	 * @return
	 */
	public void buildMaxHeap(int[] arr) {
		heapSize = arr.length;
		int lastRoot = (int) Math.floor(arr.length / 2 - 1);
		for (int n = lastRoot; n >= 0; n--) {
			maxHeapify(arr, n);
		}
	}

	/**
	 * Method to print an array as a heap(binary tree)
	 * 
	 * @param arr
	 */
	public void printAsHeap(int[] arr) {
		int h = 1;
		int low, high;
		for (int n = 0; n != arr.length; n++) {
			low = (int) (Math.pow(2, h - 1) - 1);
			high = (int) (Math.pow(2, h) - 1);
			if (n >= low && n < high) {
				System.out.print(arr[n] + "  ");
			} else {
				h++;
				System.out.print("\n");
				System.out.print(arr[n] + "  ");
			}
		}
		System.out.print("\n");
	}

	@Override
	public int[] sort() {
		buildMaxHeap(Arr);
		int temp;
		for (int n = Arr.length - 1; n != 0; n--) {
			temp = Arr[0];
			Arr[0] = Arr[n];
			Arr[n] = temp;
			heapSize--;
			/* printAsHeap(Arr); */
			maxHeapify(Arr, 0);
		}
		return Arr;
	}

	@Override
	public int[] sort(int n) {
		// TODO Auto-generated method stub
		return null;
	}

}
