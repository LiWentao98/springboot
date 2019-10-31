package com.item_bank.springboot;

import com.item_bank.springboot.mapper.QuestionMapper;
import com.item_bank.springboot.mapper.TeacherMapper;
import com.item_bank.springboot.pojo.Question;
import com.item_bank.springboot.pojo.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTests {
    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    QuestionMapper questionMapper;

//    @Test
//	public void testFindTeacher() {
//		Teacher teacher = teacherMapper.findTeacherByJobNumberAndPassword("222222222", "222222");
//		System.out.println(teacher);
//	}

    @Test
    public void testTeacherMapper() {
        Teacher teacher = new Teacher();
//		teacher.setT_id(6);
//		teacher.setT_type("审核教师");
//		teacher.setSchool("长江大学");
//      teacher.setFaculty("计算机科学学院");
//		teacher.setT_subject("数据库原理及应用");
//		teacher.setJob_number("666666666");
//		teacher.setPassword("666666");
//		teacher.setName("李六狗");
//		teacher.setId_number("666666666666666666");
//		teacher.setEmail("666666@qq.com");
//		teacher.setTelephone("66666666666");
//		teacher.setA_id(3);
//		teacherMapper.addTeacher(teacher);
//		teacherMapper.deleteTeacher(teacher);
//		teacherMapper.updateTeacher(teacher);
//      System.out.println(teacherMapper.selectTeacherByConditions(teacher));
    }

    @Test
    public void testQuestionMapper(){
        Question question = new Question();
//        question.setQ_id(6);
//        question.setQ_state("待审核");
//        question.setQ_content("试题内容哈哈哈哈");
//        question.setQ_image_url("E:\\试题库\\img\\2\\图片1.png");
//        question.setQ_type("大题");
        question.setQ_major("软件工程");
//        question.setQ_subject("Java程序设计");
//        question.setChapter("类和对象");
//        question.setDifficulty("中等");
//        question.setKnowledge("考查Java继承");
//        question.setT_id(1);
//        System.out.println(questionMapper.findQuestionByCondition(question));
        System.out.println(questionMapper.findQuestionByTId(1));
    }
}
