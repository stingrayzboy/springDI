package com.faraz.springDI.controllers;

import com.faraz.springDI.service.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
