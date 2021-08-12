package com.techark.demo123.Controller;

import com.techark.demo123.Model.Bike;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class democontroller {
    @GetMapping(value = "/apidemo")
    public String getEmp() {
        return "My first microservice API";
        //return "All Employees 1234";
    }

    @GetMapping(value = "/apidemo1")
    public Bike getemp() {
        Bike b1 = new Bike();
        b1.name = "Sashitra";
        b1.color = "Blue";
        return b1;
    }

    @GetMapping(value = "/apidemo2")
    public Bike getbike() {
        Bike b1 = new Bike();
        b1.name = "Sunil";
        b1.color = "Aqua Green";
        return b1;
    }
}
