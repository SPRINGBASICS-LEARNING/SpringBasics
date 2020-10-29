package com.learning.spring.basics.springin5steps;

import com.learning.spring.basics.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlContextApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringXmlContextApplication.class);

    public static void main(String[] args) {

        try(ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml")) {

            LOGGER.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());

            XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);
            System.out.println(personDAO);
            System.out.println(personDAO.getXmlJdbcConnection());

        }
    }

}