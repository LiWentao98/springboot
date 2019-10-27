package com.item_bank.springboot.controller.user;

/*
AdminController
管理员的视图控制层
 */

import com.item_bank.springboot.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    UserServiceImpl userService;

    @ResponseBody
    @PostMapping("/login")
    //管理员登录接口
    public HashMap login(@RequestBody Map map){
        String username = map.get("username").toString();
        String password = map.get("password").toString();
        return userService.adminLogin(username, password);
    }

    @ResponseBody
    @PostMapping("/logout")
    //管理员退出登录接口
    public void logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
    }
}
