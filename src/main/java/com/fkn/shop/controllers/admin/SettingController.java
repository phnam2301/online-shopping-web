package com.fkn.shop.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SettingController {

    @GetMapping("/admin/setting")
    public String adminSetting() {
        return "admin/settings";
    }

}
