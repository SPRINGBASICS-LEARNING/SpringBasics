package com.learning.SpringBasics;

import com.learning.SpringBasics.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

    public static void main(String[] args) {

        // BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

        ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
        System.out.println(binarySearch);
        System.out.println(binarySearch1);
        int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
        System.out.println(result);
    }

}