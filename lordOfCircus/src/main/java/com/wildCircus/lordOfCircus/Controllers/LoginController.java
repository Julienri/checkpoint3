package com.wildCircus.lordOfCircus.Controllers;

import javax.servlet.http.HttpServletRequest;

import com.wildCircus.lordOfCircus.entities.User;
import com.wildCircus.lordOfCircus.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/subscribe")
    public String subscribe(Model model) {
        model.addAttribute("user", new User());
        return "subscribe";
    }

    @PostMapping("/subscribe")
    public String store(HttpServletRequest request, User user) {
        user = userRepository.save(user);
        // try{
        // request.login(mail,password);
        // }
        // catch(ServletException e){
        // e.printStackTrace();
        // }
        return "redirect:/profile";
    }

    // Si page de profil ajouter
    @GetMapping("/profile")
    public String read(Model model, Authentication authentication) {
        if (authentication != null) {
            User user = userRepository.findByMail(authentication.getName());
            model.addAttribute("user", user);
        }
        return "profilePage";
    }
}