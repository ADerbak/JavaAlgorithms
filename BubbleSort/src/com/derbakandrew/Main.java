package com.derbakandrew;


public class Main {
	
	public static void main(String[] args) {
	
	int[] numbers = {4,3,2,1};
	
	for (int i = 0; i<numbers.length; i++) {
		System.out.println(numbers[i]);
	}
	
	int[] newnums = BubbleSort.bubbleSort(numbers);
	
	for (int j = 0; j<newnums.length; j++) {
		System.out.println(newnums[j]);
	}
	
}}
