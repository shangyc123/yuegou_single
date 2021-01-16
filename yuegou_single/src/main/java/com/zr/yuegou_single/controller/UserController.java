package com.zr.yuegou_single.controller;

import com.zr.yuegou_single.constant.CookieConstant;
import com.zr.yuegou_single.dto.ResultBean;
import com.zr.yuegou_single.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("index")
    public String getIndex(Model model){
        return "index";
    }

    @RequestMapping("logout")
    public String logout(@CookieValue(name= CookieConstant.userToken,required = false)String uuid,
                         HttpServletResponse response){

        ResultBean logout = userService.logout(uuid);
        //要把cookie给删掉
        Cookie cookie = new Cookie(CookieConstant.userToken,"");
        cookie.setMaxAge(0);
        cookie.setDomain("qf.com");
        response.addCookie(cookie);

        return "index";
    }
}
