package com.cydeo.multi_objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(configCar.class);

//        Car car1 = container.getBean("c1",Car.class);
        Car car1 = container.getBean(Car.class);
        System.out.println(car1.getMake());

//        Car car2 = container.getBean("c2",Car.class);
        Car car2 = container.getBean(Car.class);
        System.out.println(car2.getMake()); // even if you print car2, result will be "Audi" since @Primary Bean is car1

    }
}
