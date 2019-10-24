package com.item_bank.springboot.pojo;

/*
试卷类
 */

import java.util.Date;

public class ExamPaper {
    private int e_id;//试卷唯一标识
    private String e_subject;//所属科目
    private String finish_type;//组卷方式
    private Date finish_time;//组卷时间
    private int t_id;//所属教师id

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getE_subject() {
        return e_subject;
    }

    public void setE_subject(String e_subject) {
        this.e_subject = e_subject;
    }

    public String getFinish_type() {
        return finish_type;
    }

    public void setFinish_type(String finish_type) {
        this.finish_type = finish_type;
    }

    public Date getFinish_time() {
        return finish_time;
    }

    public void setFinish_time(Date finish_time) {
        this.finish_time = finish_time;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    @Override
    public String toString() {
        return "ExamPaper{" +
                "e_id=" + e_id +
                ", e_subject='" + e_subject + '\'' +
                ", finish_type='" + finish_type + '\'' +
                ", finish_time=" + finish_time +
                ", t_id=" + t_id +
                '}';
    }
}
