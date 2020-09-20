package com.example.gradlemybatis.controller;

import com.example.gradlemybatis.bean.User;
import com.example.gradlemybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/com/yzx")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/showUserList")
    public String showUserList(){
        List<User> list = userService.showUserList();
        System.out.println("list");
        return "first";
    }

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        return "first";
    }
}
