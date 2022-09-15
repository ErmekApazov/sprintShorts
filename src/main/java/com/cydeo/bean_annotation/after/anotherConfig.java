package com.cydeo.bean_annotation.after;

import org.springframework.context.annotation.Bean;

public class anotherConfig {

    @Bean
    String str(){
        return "String method created";
    }

    @Bean
    Integer integer(){
        return 100;
    }

}
