package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		SortAlgorithm sortAlgorithm = new BubbleSortAlgorithm();
		ComplexBusinessService businessService = new ComplexBusinessService(sortAlgorithm);
		
		
		
		SpringApplication.run(DemoApplication.class, args);
	}
	

	



}
