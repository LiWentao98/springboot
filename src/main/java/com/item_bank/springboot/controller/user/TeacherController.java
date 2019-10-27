package com.item_bank.springboot.controller.user;

/*
TeacherController
教师的视图控制层
 */

import com.item_bank.springboot.pojo.Teacher;
import com.item_bank.springboot.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    //自动注入service
    @Autowired
    UserServiceImpl userService;

    @ResponseBody
    @PostMapping("/login")
    //教师登录接口
    public HashMap login(@RequestBody Map map, HttpServletRequest request){
        String username = map.get("username").toString();
        String password = map.get("password").toString();

        Teacher teacher = (Teacher) userService.teacherLogin(username, password).get("user");
        HttpSession session = request.getSession();
        session.setAttribute("user",teacher);

        return userService.teacherLogin(username, password);
    }

    @ResponseBody
    @PostMapping("/logout")
    //教师退出登录接口
    public void logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
    }

}
