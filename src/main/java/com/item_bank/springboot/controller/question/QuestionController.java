package com.item_bank.springboot.controller.question;

/*
QuestionController_lwt
试题的视图控制层
 */

import com.item_bank.springboot.service.question.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
        return qUploadService.qUpload(qState,qContent,qType,qMajor,qSubject,chapter,difficulty,knowledge,t_id,qImages);
    }

}
