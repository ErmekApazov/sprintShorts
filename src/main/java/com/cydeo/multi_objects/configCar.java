package com.cydeo.multi_objects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class configCar {

//    @Bean(name="c1")
    @Bean
    @Primary
    Car car1(){
        Car c = new Car();
        c.setMake("Audi");
        return c;
    }
//    @Bean(name="c2")
    @Bean
    Car car2(){
        Car c = new Car();
        c.setMake("Tesla");
        return c;
    }
}
