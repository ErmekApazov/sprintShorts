package com.cydeo.dependency_injection;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor // annotation let you skip creating constructor and autowired annotation
public class Java {

//    @Autowired
//    public Java(OfficeHours officeHours, Agile agile) {
//        this.officeHours = officeHours; // officeHours bean is autowired
//        this.agile = agile; // agile bean is autowired
//    }

    OfficeHours officeHours;
    Agile agile;

    public void javaSession(){
        System.out.println("Java teaching hours: " + ( 20 + officeHours.getOfficeHours() + agile.getAgileSession()) );
    }
}
