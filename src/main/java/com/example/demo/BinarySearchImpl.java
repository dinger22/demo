package com.example.demo;

public class BinarySearchImpl {
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// logic here
		int[] sortedNums = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}

}
