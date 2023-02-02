package com.example.laobralaprima.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class FirstController {
    @GetMapping()
    public String ola(){
        return "Olá mundo";
    }
}
