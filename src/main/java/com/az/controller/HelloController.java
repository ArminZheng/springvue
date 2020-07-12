package com.az.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RestController = @ResponseBody + @Controller
public class HelloController {

    @Value("${person.lastName}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello " + name;
    }
}
