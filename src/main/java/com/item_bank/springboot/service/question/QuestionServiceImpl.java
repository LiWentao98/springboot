package com.item_bank.springboot.service.question;

/*
QuestionService的实现类
 */

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.item_bank.springboot.mapper.QuestionMapper;
import com.item_bank.springboot.pojo.Question;
import com.item_bank.springboot.utils.FileUploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

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

    /**
     * 配合PageHelper进行分页（此插件只进行分页）
     * @param t_id
     * @param page
     * @return
     */
    @Override
    public List<Question> qSearchByTid(Integer t_id, Integer page) {
        //设置起始点
        PageHelper.startPage(page,30);
        //获取结果集
        List<Question> questionList = questionMapper.findQuestionByTId(t_id);
        //传入要分页的结果对象
        PageInfo<Question> questionPageInfo = new PageInfo<>(questionList);
        //得到分页中的Question条目对象
        List<Question> pageList = questionPageInfo.getList();
        //返回给controller
        return pageList;
    }

}
