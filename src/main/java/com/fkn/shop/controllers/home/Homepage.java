package com.fkn.shop.controllers.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homepage {

    @GetMapping ("/")
    public String home () {
        return "home";
    }

    @GetMapping ("/access-denied")
    public String accessDenied () {
        return "access-denied";
    }

}
