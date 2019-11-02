package com.item_bank.springboot.mapper;

/*
试题类的Mapper接口
 */

import com.item_bank.springboot.mapper.sql.QuestionSqlProvider;
import com.item_bank.springboot.pojo.Question;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface QuestionMapper {
    /**
     * 分页部分封装在QuestionService层，这里只接受t_id查询结果
     * @param t_id
     * @return
     */
    @Select("select q_id, q_state, upload_time from question where t_id = #{t_id}")
    public List<Question> findQuestionByTId(Integer t_id);

    //试题保存
    @InsertProvider(type = QuestionSqlProvider.class,method = "insertQuestion")
    public void addQuestion(Question question);

    //试题删除
    @DeleteProvider(type = QuestionSqlProvider.class,method = "deleteQuestion")
    public void deleteQuestion(Question question);

    //试题修改
    @UpdateProvider(type = QuestionSqlProvider.class,method = "updateQuestion")
    public void updateQuestion(Question question);

    //根据（q_type、q_major、q_subject、chapter、difficulty、knowledge）查询试题，其中允许传空值
    @SelectProvider(type = QuestionSqlProvider.class,method = "selectQuestionByCondition")
    public List<Question> findQuestionByCondition(Question question);

}
