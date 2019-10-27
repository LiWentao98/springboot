package com.item_bank.springboot.service.question;

/*
QuestionService的实现类
 */

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class QuestionServiceImpl implements QuestionService{

    @Override
    public String qUpload(String qState, String qContent, String qType, String qMajor, String qSubject, String chapter, String difficulty, String knowledge, String t_id, MultipartFile[] qImages) {
        return null;
    }
}
