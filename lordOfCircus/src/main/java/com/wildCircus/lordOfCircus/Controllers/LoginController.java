package com.wildCircus.lordOfCircus.Controllers;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.wildCircus.lordOfCircus.entities.User;
import com.wildCircus.lordOfCircus.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/login")
    public String login(){
        return "login";
    }
    
    @GetMapping("/subscribe")
    public String subscribe(Model model) {
        model.addAttribute("user", new User());
        return "subscribe";
    }

    @GetMapping("/profile")
    public String profile(){
        return "profilePage";
    }

    @PostMapping("/subscribe")
    public String store(HttpServletRequest request, User user){
        user = userRepository.save(user);
        // try{
        //     request.login(mail,password);
        // }
        // catch(ServletException e){
        //     e.printStackTrace();
        // }
        return "redirect:/profile";
    }


    // @GetMapping("/")
    // public String project(Model model) {
    //     List<User> users = userRepository.findAll();
    //     model.addAttribute("users", users);
    //     return "profilePage";
    // }


    // Si page de profil ajouter
    // @GetMapping("/profile")
    // public String read(Model model, Authentication authentication, int id){
    //     User user = userRepository.findByMail(authentication.getName());
    //     model.addAttribute("user", user);
    //     return "profilePerso";
    // }
}