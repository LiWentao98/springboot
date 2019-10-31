package com.item_bank.springboot.service.question;

/*
试题相关的Service接口
 */

import com.item_bank.springboot.pojo.Question;
import org.springframework.web.multipart.MultipartFile;

public interface QuestionService {
    //试题上传
    public String qUpload(Question question, MultipartFile[] files);
}
