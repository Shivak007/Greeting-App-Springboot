package com.bridgelabz.greetingapp.controller;
import org.springframework.web.bind.annotation.*;
import com.bridgelabz.greetingapp.service.*;
import com.bridgelabz.greetingapp.model.*;

import java.util.List;

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

    @GetMapping("/{id}")
    public Greeting getById(@PathVariable Long id) {
        return service.getGreetingById(id);
    }

    @GetMapping("/all")
    public List<Greeting> getAll() {
        return service.getAllGreetings();
    }

    @PostMapping("/save")
    public Greeting save(@RequestParam String message) {
        return service.saveGreeting(message);
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