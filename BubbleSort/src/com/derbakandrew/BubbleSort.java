package com.derbakandrew;

import java.lang.reflect.Array;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] a) {
		
		int arrlength = Array.getLength(a);
		
		for (int i = 0; i < arrlength-1; i++) {
			for (int j = 0; j< arrlength-1-i; j++) {
				if (a[j] > a[j+1]) {
					int tmp = a[j+1];
					a[j+1] = a[j];
					a[j] = tmp;
				}
			}
		}
		return a;
	}
}
