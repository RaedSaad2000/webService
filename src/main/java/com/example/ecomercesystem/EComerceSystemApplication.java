package com.example.ecomercesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EComerceSystemApplication {

    @RequestMapping
    public String hello(){
        return "Hello";
    }
    public static void main(String[] args) {
        SpringApplication.run(EComerceSystemApplication.class, args);
    }

}
