package com.edu.springbootautoconfiggreetingstarter.service.impl;

import com.edu.springbootautoconfiggreetingstarter.properties.GreetingsProperties;
import com.edu.springbootautoconfiggreetingstarter.service.GreetingService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class GreetingServiceImpl implements GreetingService {

    private GreetingsProperties greetingsProperties;

    @Override
    public void greet() {
        String name = greetingsProperties.getName() == null
                ? System.getProperty("user.name")
                : greetingsProperties.getName();

        log.info("Hello, Dear - {}", name);
    }
}