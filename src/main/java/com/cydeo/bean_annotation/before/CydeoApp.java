package com.cydeo.bean_annotation.before;

import com.cydeo.bean_annotation.after.configMentor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        FullTimeMentor fullTimeMentor = new FullTimeMentor("Mike");
        PartTimeMentor partTimeMentor = new PartTimeMentor("Smith");

        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();


    }
}
