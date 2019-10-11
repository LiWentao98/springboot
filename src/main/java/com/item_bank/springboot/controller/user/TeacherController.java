package com.item_bank.springboot.controller.user;

/*
TeacherController
教师的视图控制层
 */

import com.item_bank.springboot.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/teacher")
@Controller
public class TeacherController {
    //自动注入service
    @Autowired
    UserServiceImpl userService;

    @ResponseBody
    @PostMapping("/login")
    public HashMap login(@RequestBody Map map){
        String username = map.get("username").toString();
        String password = map.get("password").toString();
        return userService.teacherLogin(username, password);
    }
}
