package com.example.appcenterstudygitactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping
    public String Hello() {
        return "안녕하세요";
    }
}
