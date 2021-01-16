package com.zr.yuegou_single.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
}
