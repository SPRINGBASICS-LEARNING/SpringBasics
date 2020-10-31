package com.learning.spring.basics.springin5steps;

import com.learning.spring.basics.springin5steps.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringPropertiesApplication {

    public static void main(String[] args) {

        try(AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringPropertiesApplication.class)) {

            SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
            System.out.println(someExternalService.returnServiceURL());
        }
    }

}