package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class ComplexBusinessService{
	SortAlgorithm sortAlgorithm = new BubbleSortAlgorithm();//tight coupling
}

//@Component
//public class ComplexBusinessService{
//	@Autowired
//	SortAlgorithm sortAlgorithm;// = new BubbleSortAlgorithm();
//
//	public ComplexBusinessService(SortAlgorithm sortAlgorithm){
//		this.sortAlgorithm = sortAlgorithm;
//	}
//}
