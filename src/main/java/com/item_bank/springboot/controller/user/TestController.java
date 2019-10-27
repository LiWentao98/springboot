package com.item_bank.springboot.controller.user;

/*
测试视图控制层
 */

import com.item_bank.springboot.pojo.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Enumeration;

@Controller
@RequestMapping("/test")
public class TestController {
    @ResponseBody
    @RequestMapping("/hello")
    //简单测试
    public String hello() {
        return "Hello!";
    }

    @ResponseBody
    @RequestMapping("/login")
    //测试登录
    public Teacher login(HttpServletRequest request) {
        Teacher teacher = new Teacher();
        teacher.setT_id(99999);
        teacher.setT_type("命题教师");
        teacher.setSchool("长江大学");
        teacher.setFaculty("计算机科学学院");
        teacher.setT_subject("数据结构");
        teacher.setJob_number("201700000");
        teacher.setPassword("123456");
        teacher.setName("测试用户");
        teacher.setId_number("499999999000000000");
        teacher.setEmail("10010@qq.com");
        teacher.setTelephone("10010");
        teacher.setA_id(0);

        HttpSession session = request.getSession();
        session.setAttribute("user", teacher);

        return teacher;
    }

    @ResponseBody
    @RequestMapping("/logout")
    //测试退出登录
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        return "清除session成功";
    }

    @ResponseBody
    @RequestMapping("/session")
    //查看session
    public Object info(HttpServletRequest request) {
        HttpSession session = request.getSession();
        ArrayList list = new ArrayList();
        Enumeration e = session.getAttributeNames();
        while(e.hasMoreElements()){
            list.add(session.getAttribute(e.nextElement().toString()));
        }
        return list;
    }

    @ResponseBody
    @RequestMapping("/upload")
    public String upload(
            @RequestParam("qState") String qState,
            @RequestParam("qContent") String qContent,
            @RequestParam("qType") String qType,
            @RequestParam("qMajor") String qMajor,
            @RequestParam("qSubject") String qSubject,
            @RequestParam("chapter") String chapter,
            @RequestParam("difficulty") String difficulty,
            @RequestParam("knowledge") String knowledge,
            @RequestParam("t_id") String t_id,
            @RequestParam("qImages")MultipartFile[] qImages
            ){
        for(MultipartFile f : qImages){
            String filename = f.getOriginalFilename();
        }
        return "上传成功！";
    }

}
