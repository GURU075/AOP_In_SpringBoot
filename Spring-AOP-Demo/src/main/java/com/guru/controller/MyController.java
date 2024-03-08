package com.guru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.guru.service.MyService;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/process/{input}")
    public String process(@PathVariable String input) {
        return myService.doSomething(input);
    }
}