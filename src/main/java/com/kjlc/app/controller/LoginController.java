package com.kjlc.app.controller;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    
    @GetMapping({"/login","/"})
    public String getLogin(){
        return("login");
    }
    @GetMapping("/logout")
    public String logout(){
        if(SecurityContextHolder.getContext() != null){
            SecurityContextHolder.clearContext();
        }
        return("login");
    }
    @GetMapping("/forgot")
    public String forgotPage(){
        return("forgot");
    }
}
