package com.kjlc.app.security;

import java.io.IOException;
 
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.kjlc.app.Entity.User;
 
@Component
public class AuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
 
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) throws ServletException, IOException {
 
        User userDetails = (User) authentication.getPrincipal();
         
        String redirectURL = request.getContextPath();
         
        if (userDetails.getRole().equals("ADMIN")) {
            request.getSession(false).setMaxInactiveInterval(1200);
            redirectURL = "/admin/home";
        } else if (userDetails.getRole().equals("USER")) {
            redirectURL = "/user/home";
        } 
         
        response.sendRedirect(redirectURL);
         
    }
 
}