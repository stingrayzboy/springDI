package com.faraz.springDI.controllers;

import com.faraz.springDI.service.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController setterInjectedController;
    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new PropertyGreetingServiceImpl());
    }

    @Test
    void sayGreeting() {
        System.out.println(setterInjectedController.sayGreeting());
    }
}