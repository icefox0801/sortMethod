package com.sort.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The random array generate utility
 * 
 * @author ZhJF
 * 
 */
public class RandomArray {

	public int[] generate(int n) {
		List<Integer> ls = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			ls.add(i);
		}
		Collections.shuffle(ls);
		Object[] objArray = ls.toArray();
		int[] ranArray = new int[n];
		for (int i = 0; i < n; i++) {
			ranArray[i] = (int) objArray[i];
		}
		return ranArray;
	}
}