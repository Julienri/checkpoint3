package com.wildCircus.lordOfCircus.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TicketController{
    @GetMapping("/getTicket")
    public String ticket(){
        return "tickets";
    }
}