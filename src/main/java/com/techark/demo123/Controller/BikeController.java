package com.techark.demo123.Controller;

import com.techark.demo123.Model.Bike;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
//added a line to test pull command
//@PathParam()
@RestController
public class BikeController {
    @GetMapping(value="/bikedata/{bikeId}")
    public String Bike(@PathVariable(required = false) String bikeId){
        return "This method returns bike data for id : " + bikeId;
    }
    @GetMapping(value="/bikedata1")
    public String Bike1(@RequestParam(required = false) String bikeId){
        return "This method request bike id for data : " + bikeId;
    }
    @PostMapping(value="/addbike")
    public String addbike(@RequestBody Bike bike){
        return "We are adding bike data for owner " + bike.name + "  color is " + bike.color + " and model is " + bike.model + " and manufactured in the year " + bike.yearofmfg;
    }
}
