package com.shopping.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//make this a rest api
@RestController
public class Test {
    //The roue to access the API
    @RequestMapping("/")
    public String greet(){
        return "Hello World" ;
    }
}
