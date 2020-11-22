package com.learning.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiBusiness {

    @Inject
    CdiDao cdiDao;

    public CdiDao getCdidao() {
        return cdiDao;
    }

    public void setCdidao(CdiDao cdidao) {
        this.cdiDao = cdidao;
    }

    public int findGreatest() {
        int greatest  = Integer.MIN_VALUE;
        int[] data = cdiDao.getData();
        for(int value:data) {
            if(value>greatest){
                greatest = value;
            }
        }
        return greatest;
    }
}
