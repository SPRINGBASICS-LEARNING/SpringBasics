package com.learning.spring.basics.springin5steps;

import com.learning.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
        PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
        LOGGER.info("{}", personDao);
        LOGGER.info("{}", personDao.getJdbcConnection());
        //using proxy mode in scope gives a different instance here
        LOGGER.info("{}", personDao.getJdbcConnection());
    }
}
