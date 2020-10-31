package com.learning.spring.basics.springin5steps;

import com.learning.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.learning.spring.basics.componentscan")
public class SpringComponentApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringComponentApplication.class, args);
        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
        LOGGER.info("{}", componentDAO);
    }

}
