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

    @GetMapping("/query")
    public String greetingQuery(@RequestParam(required = false) String firstName,
                                @RequestParam(required = false) String lastName) {
        return service.getGreeting(firstName, lastName);
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