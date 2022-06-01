package com.derbakandrew;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = {4,3,2,32,1,12,18};
		
		for (int number:numbers) {
			System.out.println(number);
		}
		
		int[] sorted = InsertionSort.insertionSort(numbers);
		
		for (int number:numbers) {
			System.out.println(number);
		}
	}
	
}