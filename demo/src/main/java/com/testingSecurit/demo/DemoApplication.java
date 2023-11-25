package com.testingSecurit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.testingSecurit")
public class DemoApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(DemoApplication.class, args);
        } catch (Exception e) {
            // Log or print any exceptions during startup
            e.printStackTrace();
        }
        // Add a breakpoint or log statement here to check if the application reaches this point
        System.out.println("Application started successfully.");
    }
}
