package com.faraz.springDI.controllers;

import com.faraz.springDI.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingServiceImpl")
    @Autowired
    public GreetingService greetingService;
    public String sayGreeting(){
        return greetingService.sayGreeting();
    }
}
