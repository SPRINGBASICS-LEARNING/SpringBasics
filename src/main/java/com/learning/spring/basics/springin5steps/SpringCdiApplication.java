package com.learning.spring.basics.springin5steps;

import com.learning.spring.basics.springin5steps.cdi.CdiBusiness;
import com.learning.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCdiApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringCdiApplication.class, args);
        CdiBusiness cdiBusiness = applicationContext.getBean(CdiBusiness.class);
        LOGGER.info("{} dao-{}", cdiBusiness, cdiBusiness.getCdidao());
    }
}
