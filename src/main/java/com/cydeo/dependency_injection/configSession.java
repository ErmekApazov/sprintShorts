package com.cydeo.dependency_injection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.cydeo") // if the package is provided, container will scan basePackages accordingly
@ComponentScan // without basePackage - container will scan "stereotype_annotation" package only by default.
public class configSession {

}
