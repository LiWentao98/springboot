package com.item_bank.springboot.controller.question;

/*
QuestionController_lwt
试题的视图控制层
 */

import com.item_bank.springboot.pojo.Question;
import com.item_bank.springboot.service.question.QuestionServiceImpl;
import com.item_bank.springboot.utils.ServletBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping("/question")
public class QuestionController {
    //自动注入service
    @Autowired
    QuestionServiceImpl qUploadService;

    //试题上传接口
    @ResponseBody
    @PostMapping("/upload")
    public String upload(MultipartHttpServletRequest request, @RequestParam("q_images")MultipartFile[] files){
        Question question = new Question();
        //封装question
        ServletBeanUtils.populate(question, request);
        String result = qUploadService.qUpload(question, files);
        return result;
    }

    //获取试题大致信息列表接口
//    public List getQuestionGeneralInfo() {
//
//    }

}
