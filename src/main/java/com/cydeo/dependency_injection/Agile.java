package com.cydeo.dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class Agile {

    public void agileSession(){
        System.out.println("Agile teaching hours: " + 10);
    }

    public int getAgileSession(){
        return 10;
    }
}
