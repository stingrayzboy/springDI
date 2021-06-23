package com.faraz.springDI.controllers;

import com.faraz.springDI.service.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
