package com.faraz.springDI.controllers;

import com.faraz.springDI.service.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp(){
        constructorInjectedController = new ConstructorInjectedController(new PropertyGreetingServiceImpl());
    }

    @Test
    void sayHello(){
        System.out.println(constructorInjectedController.sayHello());
    }
}