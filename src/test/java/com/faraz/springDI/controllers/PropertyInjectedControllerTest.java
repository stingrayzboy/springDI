package com.faraz.springDI.controllers;

import com.faraz.springDI.service.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController propertyInjectedController;
    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new PropertyGreetingServiceImpl();
    }

    @Test
    void sayGreeting() {
        System.out.println(propertyInjectedController.sayGreeting());
    }
}