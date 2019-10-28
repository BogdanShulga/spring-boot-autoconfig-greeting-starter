package com.edu.springbootautoconfiggreetingstarter.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cursor.greetings")
@Getter
@Setter
public class GreetingsProperties {
    private String name;
    private String msg;
}