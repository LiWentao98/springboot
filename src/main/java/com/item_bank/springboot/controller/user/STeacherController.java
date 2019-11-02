package com.item_bank.springboot.controller.user;

/*
SetAQuestionTeacherController
命题教师的视图控制层
 */

import com.item_bank.springboot.pojo.Question;
import com.item_bank.springboot.service.question.QuestionServiceImpl;
import com.item_bank.springboot.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/s_teacher")
public class STeacherController {

    @Autowired
    QuestionServiceImpl questionService;

    /**
     * 直接向前端返回查询结果
     * @param t_id
     * @param page
     * @return
     */
    @ResponseBody
    @GetMapping("/select_question_by_t_id")
    public List<Question> selectQuestionByTId(@RequestParam(value = "t_id",required=false) Integer t_id,
                                              @RequestParam(value = "page",required=false) Integer page){
        return questionService.qSearchByTid(t_id,page);
    }
}
