package com.item_bank.springboot.controller.question;

/*
QuestionController_lwt
试题的视图控制层
 */

import com.item_bank.springboot.service.question.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/question")
public class QuestionController {
    //自动注入service
    @Autowired
    QuestionServiceImpl qUploadService;

    @ResponseBody
    @PostMapping("/upload")
    public String upload(
            @RequestParam("qState") String q_state,
            @RequestParam("qContent") String q_content,
            @RequestParam("qType") String q_type,
            @RequestParam("qMajor") String q_major,
            @RequestParam("qSubject") String q_subject,
            @RequestParam("chapter") String chapter,
            @RequestParam("difficulty") String difficulty,
            @RequestParam("knowledge") String knowledge,
            @RequestParam("tId") String t_id,
            @RequestParam("qImages")MultipartFile[] q_images
            ){
        return qUploadService.qUpload(q_state,q_content,q_type,q_major,q_subject,chapter,difficulty,knowledge,t_id,q_images);
    }

}
