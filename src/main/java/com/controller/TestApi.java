package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

    @GetMapping("/hello")
    public String getHello() {

        return "Hello trunghq test jenkinsFile ngày 3";
    }
}
