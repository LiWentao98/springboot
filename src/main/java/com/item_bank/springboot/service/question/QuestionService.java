package com.item_bank.springboot.service.question;

/*
试题相关的Service接口
 */

import org.springframework.web.multipart.MultipartFile;

public interface QuestionService {
    //试题上传
    public String qUpload(
            String qState,//试题状态，不可为空
            String qContent,//试题文本内容，不可为空
            String qType,//试题题型
            String qMajor,//所属专业
            String qSubject,//所属学科
            String chapter,//所属章节名
            String difficulty,//试题难度
            String knowledge,//考查知识点，可为空
            String t_id,//所属教师id，不可为空
            MultipartFile[] qImages//试题相关图片，可为空
    );
}
