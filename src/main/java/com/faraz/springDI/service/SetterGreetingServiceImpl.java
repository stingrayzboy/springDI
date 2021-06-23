package com.faraz.springDI.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World -- Setter";
    }
}
