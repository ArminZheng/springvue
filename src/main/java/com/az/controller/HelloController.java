package com.az.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
//@RestController = @ResponseBody + @Controller
@Controller
public class HelloController {

    @Value("${person.lastName}")
    private String name;

    @RequestMapping({"/","index.html"})
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello " + name;
    }
}
