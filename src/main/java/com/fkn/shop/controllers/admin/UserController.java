package com.fkn.shop.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/admin/user")
    public String home() {
        return "admin/users";
    }

}
