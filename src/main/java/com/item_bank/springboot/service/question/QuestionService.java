package com.item_bank.springboot.service.question;

/*
试题相关的Service接口
 */

import com.item_bank.springboot.pojo.Question;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface QuestionService {
    //试题上传
    public String qUpload(Question question, MultipartFile[] files);
    //试题分页查询(通过教师ID）
    List<Question> qSearchByTid(Integer t_id, Integer page);
}
