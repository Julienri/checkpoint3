package com.wildCircus.lordOfCircus.Controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.wildCircus.lordOfCircus.entities.User;
import com.wildCircus.lordOfCircus.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
// rajouter SpringSécurity
@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    
    @GetMapping("/subscribe")
    public String subscribe(Model model){
        model.addAttribute("user", new User());
        return "subscribe";
    }

    @PostMapping("/subscribe")
    public String store(HttpServletRequest request, String fistname, 
        String lastname, String mail, String password){
            @RequestParam(defaultValue = "false"){
                User.setPassword(passwordEncoder.encode(user.getPassword()));
                user = userRepository.save(user);
                try{
                    request.login(mail,password);
                }
                catch(ServletException e){
                    e.printStackTrace();
                }
            }
        return "redirect:/";
    }
    // Si page de profil ajouter ça !
    // @GetMapping("/profile")
    // public String read(Model model, Authentication authentication, int id){
    //     User user = userRepository.findByMail(authentication.getName());
    //     model.addAttribute("user", user);
    //     return "profilePerso";
    // }
}