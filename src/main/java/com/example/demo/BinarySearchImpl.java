package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithm quickSortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// logic here
		int[] sortedNums = quickSortAlgorithm.sort(numbers);
		System.out.println(quickSortAlgorithm);
		return 3;
	}

}
