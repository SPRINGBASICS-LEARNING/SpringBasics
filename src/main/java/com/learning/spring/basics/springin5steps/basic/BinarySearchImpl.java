package com.learning.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumber = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }
}
