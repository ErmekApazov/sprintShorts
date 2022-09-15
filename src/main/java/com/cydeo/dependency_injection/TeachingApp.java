package com.cydeo.dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TeachingApp {
    public static void main(String[] args) {

        ApplicationContext container =
                new AnnotationConfigApplicationContext(configSession.class);

        Java java = container.getBean(Java.class);
        java.javaSession(java.officeHours, java.agile);


    }
}
