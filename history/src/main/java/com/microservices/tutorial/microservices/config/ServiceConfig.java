package com.microservices.tutorial.microservices.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {

    @Value("${tracer.property}")
    private String test;

    public String getTest() {
        return test;
    }
}
