package com.item_bank.springboot.pojo.total;

/*
管理员类
 */

public class Admin {
    private Integer a_id;//管理员唯一标识
    private String a_type;//管理员类型
    private String school;//所属学校
    private String faculty;//所属院系
    private String job_number;//职工号
    private String password;//登陆密码
    private String name;//姓名
    private String id_number;//身份证号
    private String email;//绑定邮箱
    private String telephone;//绑定手机号

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public String getA_type() {
        return a_type;
    }

    public void setA_type(String a_type) {
        this.a_type = a_type;
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

    @Override
    public String toString() {
        return "Admin{" +
                "a_id=" + a_id +
                ", a_type='" + a_type + '\'' +
                ", school='" + school + '\'' +
                ", faculty='" + faculty + '\'' +
                ", job_number='" + job_number + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", id_number='" + id_number + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
