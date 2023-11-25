package com.testingSecurit.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
public class Hello {
    @PostMapping("/hello")
    public String SayHello(){
       
        return "Welcome to you  saida wish u good luck in your career babe!";

    }
}
