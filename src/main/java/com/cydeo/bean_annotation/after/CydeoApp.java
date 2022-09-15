package com.cydeo.bean_annotation.after;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(configMentor.class, anotherConfig.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);

        PartTimeMentor pt = container.getBean(PartTimeMentor.class);

        ft.createAccount();
        pt.createAccount();

        String string = container.getBean(String.class);
        System.out.println(string);

        Integer integer = container.getBean(Integer.class);
        System.out.println(integer);





    }
}
