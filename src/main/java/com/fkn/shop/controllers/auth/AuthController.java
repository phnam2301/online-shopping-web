package com.fkn.shop.controllers.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }

    @GetMapping("/register")
    public String register() {
        return "auth/register";
    }

    @GetMapping("/profile")
    public String profile() {
        return "auth/profile";
    }

    @GetMapping("/rs-pwd")
    public String resetPassword() {
        return "auth/reset-password";
    }

    @GetMapping("/chg-pwd")
    public String changePassword() {
        return "auth/change-password";
    }

    @GetMapping("/access")
    public String myAccess() {
        return "auth/my-access";
    }

    @GetMapping("/denied")
    public String accessDenied() {
        return "auth/access-denied";
    }
}
