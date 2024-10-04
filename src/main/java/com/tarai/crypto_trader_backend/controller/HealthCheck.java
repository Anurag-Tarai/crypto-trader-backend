package com.tarai.crypto_trader_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping
    public String healthCheck(){
        return "ok :)";
    }

    @GetMapping("/api")
    public String secure(){
        return "ok :) secured rout";
    }
}

