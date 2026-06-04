package com.shopping.demo;

import org.springframework.stereotype.Component;


// Adding this so that SPRING can handle creating objects of this class DEV
@Component
public class Dev {
    public void build(){
        System.out.println("Building an AWESOME Project");
    }
}

