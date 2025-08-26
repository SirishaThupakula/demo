package com.coss.demo.controller;

import com.coss.demo.service.LoginService;
import com.coss.demo.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginServiceImpl;

    @GetMapping("/login")
    public String showLoginPage(ModelMap model){
       System.out.println("login method");
        return "login";
    }

    @PostMapping("/login")
    public String showWelcomePage(ModelMap model, @RequestParam String cossName, @RequestParam String cossEmail,@RequestParam String cossMobile){

        System.out.println("in post method login");
        boolean isValidCossDetails = loginServiceImpl.validateUser(cossName, cossEmail,cossMobile);

        if (!isValidCossDetails) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }

        model.put("name", cossName);
        model.put("email", cossEmail);
        model.put("mobile", cossMobile);


        return "cossWelcome";
    }

}
