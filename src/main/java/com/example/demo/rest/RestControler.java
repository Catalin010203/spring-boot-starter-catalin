package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControler {

    @GetMapping("/start")
    public String start(){
        return "Sandu Catalin";
    }
}
