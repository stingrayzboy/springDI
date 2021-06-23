package com.faraz.springDI.controllers;

import com.faraz.springDI.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp(){
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayHello(){
        System.out.println(constructorInjectedController.sayHello());
    }
}