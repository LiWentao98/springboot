package com.item_bank.springboot.pojo.total;

/*
教师类
 */

public class Teacher {
    private Integer t_id;//教师唯一标识
    private String t_type;//教师类型
    private String school;//所属学校
    private String faculty;//所属院系
    private String t_subject;//操作科目
    private String job_number;//职工号
    private String password;//登录密码
    private String name;//姓名
    private String id_number;//身份证号
    private String email;//绑定邮箱
    private String telephone;//绑定手机号
    private Integer a_id;//所属管理员id

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_type() {
        return t_type;
    }

    public void setT_type(String t_type) {
        this.t_type = t_type;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getT_subject() {
        return t_subject;
    }

    public void setT_subject(String t_subject) {
        this.t_subject = t_subject;
    }

    public String getJob_number() {
        return job_number;
    }

    public void setJob_number(String job_number) {
        this.job_number = job_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "t_id=" + t_id +
                ", t_type='" + t_type + '\'' +
                ", school='" + school + '\'' +
                ", faculty='" + faculty + '\'' +
                ", t_subject='" + t_subject + '\'' +
                ", job_number='" + job_number + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", id_number='" + id_number + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", a_id=" + a_id +
                '}';
    }
}
