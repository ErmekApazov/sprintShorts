package com.cydeo.bean_annotation.before;

public class PartTimeMentor {

    private String name;

    public PartTimeMentor(String name) {
        this.name = name;
    }

    public void createAccount(){
        System.out.println(name + " mentor is working Part Time");
    }
}
