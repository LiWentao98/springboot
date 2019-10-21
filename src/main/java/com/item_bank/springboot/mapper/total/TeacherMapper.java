package com.item_bank.springboot.mapper.total;

import com.item_bank.springboot.pojo.total.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/*
教师类的Mapper接口
 */

@Component
public interface TeacherMapper {
    //根据职工号和登陆密码查询教师
    @Select("select * from teacher where job_number=#{jobNumber} and password=#{password} ")
    public Teacher findTeacherByJobNumberAndPassword(@Param("jobNumber") String jobNumber, @Param("password") String password);
}
