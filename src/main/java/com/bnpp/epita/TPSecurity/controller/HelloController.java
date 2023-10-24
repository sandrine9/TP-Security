package com.bnpp.epita.TPSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {
    @GetMapping("/user")
    String sayHelloUser() {
        return "hello user";
    }
    @GetMapping("/admin")
    String sayHelloAdmin() {
        return "hello admin";
    }

}
