package com.cydeo.bean_annotation.after;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configMentor {

    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor("Mike");
    }

    @Bean
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor("Smith");
    }
}
