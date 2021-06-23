package com.faraz.springDI.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World -- Constructor";
    }
}
