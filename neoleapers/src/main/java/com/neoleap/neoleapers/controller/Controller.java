package com.neoleap.neoleapers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String tellHello (@RequestParam String name) {
        return "hello " + name;
    }

    @GetMapping("/error")
    public String tellerror () {
        return "there is an error";
    }
}
