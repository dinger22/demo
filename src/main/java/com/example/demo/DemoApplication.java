package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[3], 3);
		System.out.println(result);
		
		
	}
	
}

//
////what happened in the background
//1.Component scan
//2.creating instance of bean 'binarySearch'
//	2.1 creating instance of bean 'bubbleSortAlgorithm'
//	2.2 finish creating
//3.Do autowire: set binarySearch.sortAlgorithm = bubbleSortAlgorithm
//4.finished creatinng instance of bean 'binarySearch'
