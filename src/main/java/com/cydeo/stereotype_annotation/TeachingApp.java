package com.cydeo.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TeachingApp {
    public static void main(String[] args) {

        ApplicationContext container =
                new AnnotationConfigApplicationContext(configSession.class);

        Agile agile = container.getBean(Agile.class);
        agile.agileSession();

        Java java = container.getBean(Java.class);
        java.javaSession();

//        Python python = container.getBean(Python.class);
//        python.pythonSession(); // Python class does not have @Component annotation, therefore container will not retrieve python bean.


    }
}
