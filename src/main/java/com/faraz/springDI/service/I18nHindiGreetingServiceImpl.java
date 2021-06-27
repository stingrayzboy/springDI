package com.faraz.springDI.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("HD")
@Service("i18nService")
public class I18nHindiGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Kese ho re!";
    }
}
