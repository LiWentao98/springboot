package com.item_bank.springboot.controller.user;

/*
测试视图控制层
 */

import com.item_bank.springboot.pojo.Question;
import com.item_bank.springboot.pojo.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Map;

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
    @RequestMapping("/get_question_by_id")
    public Question getQuestionById(@RequestBody Map map){
        String qId = map.get("id").toString();
        Question question = new Question();
        question.setQ_id(Integer.parseInt(qId));
        question.setQ_state("通过");
        question.setQ_content("试题内容aaaaaa");
        question.setQ_type("大题");
        question.setQ_major("计算机科学学院");
        question.setQ_subject("计算机网络");
        question.setChapter("网络层");
        question.setDifficulty("中等");
        question.setKnowledge("网络层基础");
        question.setUpload_time(new Date());
        question.setT_id(2);
        return question;
    }

}
