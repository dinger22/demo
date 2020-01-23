package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm quickSortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// logic here
		int[] sortedNums = quickSortAlgorithm.sort(numbers);
		System.out.println(quickSortAlgorithm);
		return 3;
	}

}
