package com.Project.App.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "Welcome to my page";
    }
    @RequestMapping("/about")
    public String about(){
        return "Welcome to about";
    }
}
