package com.item_bank.springboot.controller.xh.user;

/*
AdminController
管理员的视图控制层
 */

import com.item_bank.springboot.service.total.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin_xh")
public class AdminController_xh {
    @Autowired
    UserServiceImpl userService;

    @ResponseBody
    @PostMapping("/login")
    public HashMap login(@RequestBody Map map){
        String username = map.get("username").toString();
        String password = map.get("password").toString();
        return userService.adminLogin(username, password);
    }
}
