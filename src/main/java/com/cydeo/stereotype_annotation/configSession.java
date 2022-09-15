package com.cydeo.stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
//@ComponentScan(basePackages = "com.cydeo") // if the package is provided, container will scan basePackages accordingly
@ComponentScan // without basePackage - container will scan "stereotype_annotation" package only by default.
public class configSession {

}
