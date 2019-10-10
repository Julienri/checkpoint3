package com.wildCircus.lordOfCircus.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController{
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/describe")
    public String describe(){
        return "description";
    }
}