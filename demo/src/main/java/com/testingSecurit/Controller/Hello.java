package com.testingSecurit.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hello {
    @GetMapping("/hello")
    public String SayHello(){
       
        return "Welcome to you  saida wish u good luck in your career babe!";

    }
}
