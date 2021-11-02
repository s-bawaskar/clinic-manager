package com.cm.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Health controller code goes here
 */
@RestController
public class HealthController {
    @GetMapping(path = "health")
    public String health() {
        return "OK";
    }
}
