package com.fkn.shop.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Dashboard {

    @GetMapping("/admin/dashboard")
    public String admin() {
        return "admin/dashboard";
    }

}
