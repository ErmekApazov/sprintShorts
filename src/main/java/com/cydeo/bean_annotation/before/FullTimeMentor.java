package com.cydeo.bean_annotation.before;

public class FullTimeMentor {

    private String name;

    public FullTimeMentor(String name) {
        this.name = name;
    }

    public void createAccount(){
        System.out.println(name + " mentor is working Full Time");
    }
}
