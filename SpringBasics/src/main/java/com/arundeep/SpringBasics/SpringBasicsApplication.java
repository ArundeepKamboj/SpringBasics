package com.arundeep.SpringBasics;

import com.arundeep.SpringBasics.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		System.out.println("Starting Spring Application");

		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[] {1,2,3,4,5,6,7}, 4);
		System.out.println(result);
		System.out.println(binarySearch);
		System.out.println(binarySearch.sortAlgorithm);

		BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch2);
		System.out.println(binarySearch2.sortAlgorithm);
	}

}
