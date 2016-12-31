package com.langtai.controller;

import com.langtai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wang on 16-12-30.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/getAllUsers")
    public String getAllUsers(HttpServletRequest request){
        request.setAttribute("users",userService.getAllUser());
        return "user";
    }
}
