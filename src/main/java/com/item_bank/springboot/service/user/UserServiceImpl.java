package com.item_bank.springboot.service.user;

/*
UserService的实现类
 */

import com.item_bank.springboot.mapper.AdminMapper;
import com.item_bank.springboot.mapper.TeacherMapper;
import com.item_bank.springboot.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserServiceImpl implements UserService {
    //自动注入mapper
    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    AdminMapper adminMapper;

    @Override
    public HashMap teacherLogin(String jobNumber, String password) {
        HashMap<String, Object> data = new HashMap<String, Object>();
        Teacher teacher = teacherMapper.findTeacherByJobNumberAndPassword(jobNumber,password);
        data.put("teacher",teacher);
        if(teacher != null){
            data.put("msg", "登录成功！");
        }else {
            data.put("msg", "密码错误！");
        }
        return data;
    }

    @Override
    public HashMap adminLogin(String jobNumber, String password) {
        return null;
    }
}
