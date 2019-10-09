package com.wildCircus.lordOfCircus.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController{
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/subscribe")
    public String subscribe(){
        return "subscribe";
    }
}