package com.learning.spring.basics.springin5steps;

import com.learning.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsApplication.class);

    public static void main(String[] args) {

        // BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

        /*
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
        System.out.println(binarySearch);
        System.out.println(binarySearch1);
        int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
        System.out.println(result);*/

        ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
        PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
        LOGGER.info("{}", personDao);
        LOGGER.info("{}", personDao.getJdbcConnection());
        //using proxy mode in scope gives a different instance here
        LOGGER.info("{}", personDao.getJdbcConnection());

        LOGGER.info("{}", personDao2);
        LOGGER.info("{}", personDao2.getJdbcConnection());
    }

}