package com.bridgelabz.greetingapp.controller;
import org.springframework.web.bind.annotation.*;
import com.bridgelabz.greetingapp.service.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private final GreetingService service;

    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @GetMapping
    public String getGreeting() {
        return service.getGreeting();
    }

    @PostMapping
    public String postGreeting() {
        return "Hello World";
    }

    @PutMapping
    public String putGreeting() {
        return "Hello World";
    }

    @DeleteMapping
    public String deleteGreeting() {
        return "Hello World";
    }
}