package com.techark.demo123.Controller;

import com.techark.demo123.Model.Bike;
import org.springframework.web.bind.annotation.*;

@RestController

public class demoController1 {
    @GetMapping(value = "/demo")
    public String myDemo() {
        return "This method reads data";
    }
    // reading data with getmapping CURD - Read operation
    @GetMapping(value = "/readData")
    public Bike getemp() {
        Bike b1 = new Bike();
        b1.name = "Sashitra";
        b1.color = "Blue";
        b1.model="Royal Enfield";
        b1.yearofmfg=2020;
        return b1;
    }
    // CURD - Create operation
    @PostMapping(value= "/createData")
    public String createData(){
        return "This method will post data";
    }

    //CURD - Update Operation
    @PutMapping(value= "/createData")
    public String editData(){
        return "This method will edit data";
    }

    //CURD - Delete Operation
    @DeleteMapping(value= "/deleteData")
    public String deleteData(){
        return "This method will delete data";
    }



}

