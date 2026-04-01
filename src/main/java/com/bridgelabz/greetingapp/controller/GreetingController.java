package com.bridgelabz.greetingapp.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public String getGreeting() {
        return "Hello World";
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