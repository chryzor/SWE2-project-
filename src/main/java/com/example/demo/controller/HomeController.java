package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Serve the home page
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Serve the login page
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // Serve the booking form page
    @GetMapping("/book")
    public String book() {
        return "book";
    }

    // Serve the dashboard page
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
}
