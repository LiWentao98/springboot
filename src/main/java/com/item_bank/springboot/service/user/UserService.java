package com.item_bank.springboot.service.user;

/*
用户通用的Service接口
 */

import java.util.HashMap;

public interface UserService {
    //教师类型的用户登录接口
    public HashMap teacherLogin(String jobNumber, String password);
    //管理员类型的用户登录接口
    public HashMap adminLogin(String jobNumber, String password);
}
