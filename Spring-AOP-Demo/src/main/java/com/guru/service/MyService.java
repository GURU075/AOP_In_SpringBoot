package com.guru.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String doSomething(String value) {
        return "Processed: " + value;
    }
}
