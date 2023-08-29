package com.achu.springboot.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FunRestController {
    // explose "/"" that return "Hello World"

    @GetMapping("/")
    public String SayHello() {
        return "Hello World";
    
    }

}
