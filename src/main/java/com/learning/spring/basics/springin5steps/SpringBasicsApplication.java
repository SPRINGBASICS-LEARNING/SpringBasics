package com.learning.spring.basics.springin5steps;

import com.learning.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringBasicsApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringBasicsApplication.class);

         // BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());


        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
        System.out.println(binarySearch);
        System.out.println(binarySearch1);
        int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
        System.out.println(result);
    }

}