package com.item_bank.springboot.service.question;

/*
QuestionService的实现类
 */

import com.item_bank.springboot.mapper.QuestionMapper;
import com.item_bank.springboot.pojo.Question;
import com.item_bank.springboot.utils.FileUploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class QuestionServiceImpl implements QuestionService{
    @Autowired
    QuestionMapper questionMapper;

    @Override
    public String qUpload(Question question, MultipartFile[] files) {
        try {
            String url = null;
            if (null != files && files.length > 0) {
                for (MultipartFile file : files) {
                    url = FileUploadUtils.saveFile(file, String.valueOf(question.getT_id()));
                    System.out.println(url);
                    url = url + "*";
                }
                question.setQ_image_url(url);
            }
            questionMapper.addQuestion(question);
            return "上传成功";
        }catch (IOException e) {
            e.printStackTrace();
            return "上传失败";
        }
    }

}
