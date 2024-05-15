package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    @ResponseBody
    public String getMethodName() {
        return new String("WELCOME");
    }
    
}
