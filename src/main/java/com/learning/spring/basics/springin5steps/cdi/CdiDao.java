package com.learning.spring.basics.springin5steps.cdi;

import javax.inject.Named;

@Named
public class CdiDao {
    public int[] getData() {
        return new int[] {5,89,100};
    }
}
