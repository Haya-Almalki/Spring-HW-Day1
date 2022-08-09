package com.example.spring_hw1_day1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @RequestMapping(value ="/hey",method= RequestMethod.GET)
    public String getHey(){
        return"Hey frome spring";
    }
    @RequestMapping(value="/bye",method=RequestMethod.GET)
    public String getBye(){
        return "Bye";
    }
    @RequestMapping(value="/check/status",method=RequestMethod.GET)
    public String getCheck(){
        return "Everything OK";
    }
    @RequestMapping(value = "health",method=RequestMethod.GET)
    public String getHealth(){
        return "Server health is up and running";
    }

}
