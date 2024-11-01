package com.fkn.shop.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/ad/user")
    public String adminUser() {
        return "admin/users";
    }

}
